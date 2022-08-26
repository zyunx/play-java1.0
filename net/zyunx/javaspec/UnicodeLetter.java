package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class UnicodeLetter extends SingleInputElement {

  public UnicodeLetter(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a unicode letter.");
  }

  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == '_'
      || c == '$'
      || c >= 'a' && c <= 'z'
      || c >= 'A' && c <= 'Z';
  }

}
