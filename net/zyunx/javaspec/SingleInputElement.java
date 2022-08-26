package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class SingleInputElement extends InputElement {

  private LineTerminator lineTerminator;
  private InputCharacter inputCharacter;

  public SingleInputElement(LineTerminator lineTerm) {
    lineTerminator = lineTerm;
  }
  public SingleInputElement(InputCharacter inputChar) {
    inputCharacter = inputChar;
  }

  public boolean isLineTerminator() {
    return lineTerminator != null;
  }

  public InputCharacter getInputCharacter() {
    return inputCharacter;
  }

  public int getSize() {
    return 1;
  }

  public String toString() {
    if (isLineTerminator()) {
      return "<WhiteSpace<LineTerminator>>";
    } else {
      return inputCharacter.toString(); 
    }
  }
}
