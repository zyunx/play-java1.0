package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class HexDigit extends SingleInputElement {
  public HexDigit(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a hex digit.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return (c >= '0' && c <= '9')
      || (c >= 'a' && c <= 'f')
      || (c >= 'A' && c <= 'F');
  }
}
