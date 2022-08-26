package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DigitParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return Digit.is(source.getInputCharacter());
  }
  public static boolean is(SecondStepSource source, int pos) {
    if (source.isLineTerminatorAt(pos)) {
      return false;
    }
    return Digit.is(source.getInputCharacterAt(pos));
  }
  public static Digit parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Digit expected");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new Digit(c);
  }
}
