package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FloatTypeSuffixParser {
  public static boolean is(SecondStepSource source) {
    if (source.isInputCharacter()) {
      return FloatTypeSuffix.is(source.getInputCharacter());
    }
    return false;
  }
  public static FloatTypeSuffix parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Float type suffix expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new FloatTypeSuffix(c);
  }
}
