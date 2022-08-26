package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NonZeroDigitParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return NonZeroDigit.is(source.getInputCharacter());
  }
  public static NonZeroDigit parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "None zero digit expected");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new NonZeroDigit(c);
  }

}
