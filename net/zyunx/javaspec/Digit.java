package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Digit extends SingleInputElement {
  public Digit(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a digit.");
  }
  public static boolean is(InputCharacter ic) {
    return ic.getChar() == '0' || NonZeroDigit.is(ic);
  }
}
