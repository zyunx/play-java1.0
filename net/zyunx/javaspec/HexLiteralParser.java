package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class HexLiteralParser {
  public static boolean is(SecondStepSource source) {
    int pos = source.getPos();
    return source.isInputCharacterAt(pos, '0')
      && (source.isInputCharacterAt(pos+1, 'x')
          || source.isInputCharacterAt(pos+1, 'X'))
      && (source.isInputCharacterAt(pos+2)
          && HexDigit.is(source.getInputCharacterAt(pos+2)));
  }
  public static HexLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Hex literal expected");
    source.proceed();
    source.proceed();
    Vector digits = new Vector();
    while (HexDigitParser.is(source)) {
      HexDigit d = HexDigitParser.parse(source);
      digits.addElement(d);
    }
    return new HexLiteral(digits);
  }
}
