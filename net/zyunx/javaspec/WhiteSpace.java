package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class WhiteSpace extends SingleInputElement {
  public WhiteSpace(LineTerminator lineTerm) {
    super(lineTerm);
  }
  public WhiteSpace(InputCharacter inputChar) {
    super(inputChar);
  }
  public String toString() {
    if (isLineTerminator()) {
      return "<WhiteSpace<LineTerminator>>\n";
    } else {
      //return "<WhiteSpace<" + getInputCharacter() + ">>";
      return getInputCharacter().toString();
    }
  }
}
