package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SingleCharacterImpl
  extends SingleInputElement implements SingleCharacter {

  public SingleCharacterImpl(InputCharacter c) {
    super(c);
    Assert.assertArg(is(c), "Not a single character.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c != '\'' && c != '\\'; 
  }
  public String toString() {
    return "<Char<" + getInputCharacter() + ">>";
  }
}
