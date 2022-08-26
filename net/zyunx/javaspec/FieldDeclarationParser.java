package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FieldDeclarationParser {
  public static final FieldDeclarationParser SINGLETON =
    new FieldDeclarationParser();

  public static FieldDeclarationParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    //System.out.println("DEBUG: " + t);
    if (t instanceof Separator) {
      Separator s = (Separator) t;
      return !s.is('}');
    } else {
      return true;
    }
  }

  public FieldDeclaration parse(ThirdStepSource source) {
    return FieldVariableDeclarationParser.get().parse(source);
  }
}
