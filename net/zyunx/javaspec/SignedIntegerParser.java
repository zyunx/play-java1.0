package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SignedIntegerParser {
  public static boolean is(SecondStepSource source) {
    int pos = source.getPos();
    InputCharacter tmp = null;
    if (source.isLineTerminator()) {
      return false;
    }
    tmp = source.getInputCharacterAt(pos);
    if (Sign.is(tmp)) {
      pos++;
      tmp = source.getInputCharacterAt(pos);
    }
    return DigitsParser.is(source, pos);
  }
  public static SignedInteger parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Signed integer expected");
    Sign sign = null;
    Digits digits = null;

    if (SignParser.is(source)) {
      sign = SignParser.parse(source);
    }
    digits = DigitsParser.parse(source);

    return new SignedInteger(sign, digits);
  }
}
