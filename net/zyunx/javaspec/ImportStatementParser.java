package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ImportStatementParser {
  public static final ImportStatementParser SINGLETON =
    new ImportStatementParser();

  public static ImportStatementParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token token = source.getToken();
    if (token instanceof Keyword) {
      Keyword kw = (Keyword) token;
      return kw.is("import");
    }
    return false;
  }

  public ImportStatement parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "PackageNameStatement expected.");
    PackageStatement result = null;

    source.proceed();

    PackageOrTypeNameParser nameParser = PackageOrTypeNameParser.get();
    PackageOrTypeName name = nameParser.parse(source);

    if (isSemicolon(source)) {
      source.proceed();
      return new PackageOrTypeImportStatement(name);
    }

    //System.out.println("DEBUG: " + source.getToken().getText());
    if (!isDot(source)) {
      throw new SyntaxException(source, "Dot . expected");
    }
    source.proceed();

    if (!isStar(source)) {
      throw new SyntaxException(source, "Star * expected");
    }
    source.proceed();

    if (!isSemicolon(source)) {
      throw new SyntaxException(source, "Semicolon ; expected");
    }
    source.proceed();

    return new TypeImportOnDemandStatement(name.asPackageName());
  }
  private boolean isDot(ThirdStepSource source) {
    Object token = source.getToken();
    if (token instanceof Separator) {
      Separator sep = (Separator) token;
      if (sep.isDot()) {
        return true;
      }
    }
    return false;
  }
  private boolean isSemicolon(ThirdStepSource source) {
    Object token = source.getToken();
    if (token instanceof Separator) {
      Separator sep = (Separator) token;
      if (sep.isSemicolon()) {
        return true;
      }
    }
    return false;
  }
  private boolean isStar(ThirdStepSource source) {
    Object token = source.getToken();
    if (token instanceof Operator) {
      Operator op = (Operator) token;
      if ("*".equals(op.getText())) {
        return true;
      }
    }
    return false;
  }
}
