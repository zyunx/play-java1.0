package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ExponentIndicator extends SingleInputElement {
  public ExponentIndicator(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not an exponent indicator.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == 'E' || c == 'e';
  }
}
