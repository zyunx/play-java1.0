package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class IntegerTypeSuffixParser {
  public static boolean is(SecondStepSource source) {
    if (source.isInputCharacter()) {
      return IntegerTypeSuffix.is(source.getInputCharacter());
    }
    return false;
  }
  public static IntegerTypeSuffix parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Integer type suffix expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new IntegerTypeSuffix(c);
  }
}
