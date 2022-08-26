package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class VariableModifierParser {
  public static final VariableModifierParser SINGLETON =
    new VariableModifierParser();

  public static VariableModifierParser get() {
    return SINGLETON;
  }
  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    if (t instanceof Keyword) {
      Keyword k = (Keyword) t;
      if (VariableModifier.is(k)) {
        return true;
      }
    }
    return false;
  }
  public VariableModifier parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "VariableModifier expected");
    Token t = source.getToken();
    source.proceed();
    return new VariableModifier((Keyword) t);
  }
}
