package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class UnknownInputElement extends SingleInputElement
  implements Token {

  public UnknownInputElement(InputCharacter inputChar) {
    super(inputChar);
  }

  public String getText() {
    return "" + getInputCharacter().getChar();
  }
  public int getLine() {
    return 0;
  }
  public int getColumn() {
    return 0;
  }

}
