package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SignParser {
  public static boolean is(SecondStepSource source) {
    if (source.isInputCharacter()) {
      return Sign.is(source.getInputCharacter());
    }
    return false;
  }
  public static Sign parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Sign expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new Sign(c);
  }
}
