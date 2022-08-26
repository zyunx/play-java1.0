package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class StringLiteralParser {
  public static final StringLiteralParser SINGLETON =
    new StringLiteralParser();

  public static StringLiteralParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    boolean result = source.isInputCharacter('\"');
    return result;
  }
  public StringLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "String literal expected");
    Mark mark = source.mark();

    InputCharacter q1 = null;
    StringCharacters chars = new StringCharactersImpl(new Vector());
    InputCharacter q2 = null;

    q1 = source.getInputCharacter();
    source.proceed();

    if (StringCharactersParser.get().is(source)) {
      chars = StringCharactersParser.get().parse(source);
    } 

    if (source.isInputCharacter('\"')) {
      q2 = source.getInputCharacter();
      source.proceed();
    } else {
      throw new ParseException(source, "Double quote expected.");
    }

    return new StringLiteralImpl(q1, chars, q2,
        mark.getLine(), mark.getColumn());
  }
}
