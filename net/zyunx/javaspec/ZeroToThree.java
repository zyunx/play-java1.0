package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ZeroToThree extends SingleInputElement {
  public ZeroToThree(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not zero to three.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c >= '0' && c <= '3';
  }
}
