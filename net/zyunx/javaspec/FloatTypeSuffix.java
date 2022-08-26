package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FloatTypeSuffix extends SingleInputElement {
  public FloatTypeSuffix(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a float type suffix.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == 'f' || c == 'F' || c == 'd' || c == 'D';
  }
}
