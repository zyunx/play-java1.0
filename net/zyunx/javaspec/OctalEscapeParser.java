package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OctalEscapeParser {
  public static boolean is(SecondStepSource source) {
    boolean result = false;
    Mark mark = source.mark();
    if (source.isInputCharacter('\\')) {
      source.proceed();
      result = ZeroToThreeParser.is(source) || OctalDigitParser.is(source);
    }
    source.go(mark);
    return result;
  }
  public static OctalEscape parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Octal escape expected");
    InputCharacter backSlash = source.getInputCharacter();
    source.proceed();
    if (ZeroToThreeParser.is(source)) {
      ZeroToThree ztt = ZeroToThreeParser.parse(source);
      OctalDigit od1 = OctalDigitParser.parse(source);
      OctalDigit od2 = OctalDigitParser.parse(source);
      return new OctalEscape();
    } else if (OctalDigitParser.is(source)) {
      OctalDigit od1 = OctalDigitParser.parse(source);
      if (OctalDigitParser.is(source)) {
        OctalDigit od2 = OctalDigitParser.parse(source);
        return new OctalEscape();
      } else {
        return new OctalEscape();
      }
    } else {
      Assert.impossible("Invalid octal escape.");
      return null;
    }
  }
}
