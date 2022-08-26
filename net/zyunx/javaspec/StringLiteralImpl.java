package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;

public class StringLiteralImpl extends TokenSupport
  implements StringLiteral {

  private InputCharacter quoteLeft;
  private StringCharacters stringCharacters;
  private InputCharacter quoteRight;

  public StringLiteralImpl(InputCharacter q1,
      StringCharacters chars, InputCharacter q2,
      int line, int column) {
    super(line, column);
    quoteLeft = q1;
    stringCharacters = chars;
    quoteRight = q2;
  }
  public String getText() {
    throw new UnsupportedOperationException();
  }
  public String toString() {
    return "<StringLiteral<"
      + stringCharacters.toString()
      + ">>";
  }
}
