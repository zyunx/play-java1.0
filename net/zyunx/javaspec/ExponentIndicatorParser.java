package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ExponentIndicatorParser {
  public static boolean is(SecondStepSource source) {
    if (source.isInputCharacter()) {
      return ExponentIndicator.is(source.getInputCharacter());
    }
    return false;
  }
  public static ExponentIndicator parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Exponent indicator expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new ExponentIndicator(c);
  }
}
