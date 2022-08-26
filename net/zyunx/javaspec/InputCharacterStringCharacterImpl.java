package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class InputCharacterStringCharacterImpl
  extends SingleInputElement
  implements StringCharacter {

  public InputCharacterStringCharacterImpl(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a string character.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c != '\"' && c != '\\'; 
  }
  public String toString() {
    return getInputCharacter().toString();
  }
}
