package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Sign extends SingleInputElement {
  public Sign(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a sign.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == '+' || c == '-';
  }
}
