package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class HexDigitParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return HexDigit.is(source.getInputCharacter());
  }
  public static HexDigit parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Hex digit expected");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new HexDigit(c);
  }

}
