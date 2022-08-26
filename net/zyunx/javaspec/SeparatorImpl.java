package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SeparatorImpl
  extends TokenSupport
  implements Separator {

  private InputCharacter inputCharacter;

  public SeparatorImpl(InputCharacter c, int line, int column) {
    super(line, column);
    this.inputCharacter = c;
    Assert.assertArg(is(c), "Not a string character.");
  }
  public static boolean is(InputCharacter ic) {
    char c = ic.getChar();
    return c == '{' || c == '}'
      || c == '(' || c == ')'
      || c == '[' || c == ']'
      || c == ';' || c == ',' || c == '.'; 
  }
  public String toString() {
    return getText();
    //return "<Separator<" + getText() + ">>";
  }

  public InputCharacter getInputCharacter() {
    return inputCharacter;
  }
  public String getText() {
    return getInputCharacter().toString();
  }
  public boolean isDot() {
    return '.' == getInputCharacter().getChar();
  }
  public boolean isSemicolon() {
    return ';' == getInputCharacter().getChar();
  }
  public boolean isComma() {
    return ',' == getInputCharacter().getChar();
  }
  public boolean is(char c) {
    return c == getInputCharacter().getChar();
  }
}
