package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class InputCharacter {

  private char theChar;

  public InputCharacter(EscapedInputCharacter escaped) {
    Assert.assertArg(escaped.getChar() != '\r',
        "'\\r' is not InputCharacter");
    Assert.assertArg(escaped.getChar() != '\n',
        "'\\n' is not InputCharacter");
    theChar = escaped.getChar();
  }

  public char getChar() {
    return theChar;
  }

  public String toString() {
    return "" + theChar;
  }
}
