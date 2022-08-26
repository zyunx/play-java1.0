package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ExponentPartParser {
  public static boolean is(SecondStepSource source) {
    return ExponentIndicatorParser.is(source);
  }
  public static ExponentPart parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Exponent part expected");
    ExponentIndicator ei = null;
    SignedInteger si = null;

    ei = ExponentIndicatorParser.parse(source);
    if (SignedIntegerParser.is(source)) {
      si = SignedIntegerParser.parse(source);
    }

    return new ExponentPart(ei, si);
  }
}
