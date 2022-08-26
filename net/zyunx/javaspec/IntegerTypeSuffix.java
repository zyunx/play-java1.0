package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class IntegerTypeSuffix extends SingleInputElement {
  public IntegerTypeSuffix(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a integer type suffix.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == 'l' || c == 'L';
  }
}
