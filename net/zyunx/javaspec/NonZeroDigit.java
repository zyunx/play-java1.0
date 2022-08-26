package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NonZeroDigit extends SingleInputElement {

  public NonZeroDigit(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a non zero digit.");
  }

  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c >= '1' && c <= '9';
  }

}
