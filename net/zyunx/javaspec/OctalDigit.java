package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OctalDigit extends SingleInputElement {
  public OctalDigit(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a octal digit.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c >= '0' && c <= '7';
  }
}
