package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OctalLiteralParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return OctalDigitParser.is(source);
  }
  public static OctalLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Octal literal expected");
    Vector digits = new Vector();
    while (OctalDigitParser.is(source)) {
      OctalDigit d = OctalDigitParser.parse(source);
      digits.addElement(d);
    }
    return new OctalLiteral(digits);
  }
}
