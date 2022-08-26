package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DecimalLiteralParser {
  public static boolean is(SecondStepSource source) {
    return NonZeroDigitParser.is(source);
  }
  public static DecimalLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Decimal literal expected");
    NonZeroDigit nzd = NonZeroDigitParser.parse(source);
    Digits ds = null;
    if (DigitsParser.is(source)) {
      ds = DigitsParser.parse(source);
    }
    return new DecimalLiteral(nzd, ds);
  }
}
