package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OctalDigitParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return OctalDigit.is(source.getInputCharacter());
  }
  public static OctalDigit parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Octal digit expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new OctalDigit(c);
  }

}
