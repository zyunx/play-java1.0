package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class PackageStatementParser {
  public static final PackageStatementParser SINGLETON =
    new PackageStatementParser();

  public static PackageStatementParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token token = source.getToken();
    if (token instanceof Keyword) {
      Keyword kw = (Keyword) token;
      return kw.is("package");
    }
    return false;
  }

  public PackageStatement parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "PackageNameStatement expected.");
    PackageStatement result = null;

    source.proceed();
    PackageNameParser nameParser = PackageNameParser.get();
    PackageName name = nameParser.parse(source);

    Object token = source.getToken();
    if (token instanceof Separator) {
      Separator sep = (Separator) token;
      if (!sep.isSemicolon()) {
        throw new ParseException(source, "semicolon ; expected");
      }
      source.proceed();
    } else {
      throw new ParseException(source, "semicolon ; expected");
    }
    return new PackageStatement(name); 
  }
}
