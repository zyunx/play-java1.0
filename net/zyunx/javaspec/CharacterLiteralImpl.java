package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;

public class CharacterLiteralImpl extends TokenSupport
    implements CharacterLiteral {
  private InputCharacter quoteLeft;
  private SingleCharacter singleCharacter;
  private Escape escape;
  private InputCharacter quoteRight;

  public CharacterLiteralImpl(InputCharacter q1,
      SingleCharacter sc, InputCharacter q2, int line, int column) {
    super(line, column);
    quoteLeft = q1;
    singleCharacter = sc;
    quoteRight = q2;
  }
  public CharacterLiteralImpl(InputCharacter q1,
      Escape es, InputCharacter q2, int line, int column) {
    super(line, column);
    quoteLeft = q1;
    escape = es;
    quoteRight = q2;
  }
  public String getText() {
    throw new UnsupportedOperationException();
  }
  public String toString() {
    return "<CharacterLiteral"
      + (singleCharacter != null ?
        singleCharacter.toString()
        : escape.toString())
      + ">";
  }
}
