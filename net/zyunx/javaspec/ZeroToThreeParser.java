package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ZeroToThreeParser {
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return false;
    }
    return ZeroToThree.is(source.getInputCharacter());
  }
  public static ZeroToThree parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Zero to three expected.");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new ZeroToThree(c);
  }

}
