package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;

public class ClassBodyParser {
  public static final ClassBodyParser SINGLETON =
    new ClassBodyParser();

  public static ClassBodyParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    if (t instanceof Separator) {
      Separator s = (Separator) t;
      return s.is('{');
    }
    return false;
  }
  public ClassBody parse(ThirdStepSource source) {
    Assert.assertArg(is(source), "ClassBody expected");

    source.proceed();

    FieldDeclarations declarations = 
      FieldDeclarationsParser.get().parse(source);

    int nested = 0;
    while (nested >= 0) {
      Token t = source.getToken();
      if (t instanceof Separator) {
        Separator s = (Separator) t;
        if (s.is('{')) {
          nested++;
        } else if (s.is('}')) {
          nested--;
        }
      }
      source.proceed();
    }
    Assert.assertTrue(source.isEnd(), "Error");
    return new ClassBody(declarations);
  }
}
