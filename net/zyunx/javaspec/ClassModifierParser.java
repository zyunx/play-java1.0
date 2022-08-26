package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassModifierParser {
  public static final ClassModifierParser SINGLETON =
    new ClassModifierParser();

  public static ClassModifierParser get() {
    return SINGLETON;
  }
  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    if (t instanceof Keyword) {
      Keyword k = (Keyword) t;
      if (ClassModifier.is(k)) {
        return true;
      }
    }
    return false;
  }
  public ClassModifier parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "ClassModifier expected");
    Token t = source.getToken();
    source.proceed();
    return new ClassModifier((Keyword) t);
  }
}
