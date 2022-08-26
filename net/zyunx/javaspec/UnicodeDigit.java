package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class UnicodeDigit extends SingleInputElement {

  public UnicodeDigit(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a unicode digit.");
  }

  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c >= '0' && c <= '9';
  }

}
