package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class CharacterLiteralParser {
  public static final CharacterLiteralParser SINGLETON =
    new CharacterLiteralParser();

  public static CharacterLiteralParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    boolean result = source.isInputCharacter('\'');
    return result;
  }
  public CharacterLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Character literal expected");
    InputCharacter q1 = null;
    SingleCharacter singleCharacter = null;
    Escape escape = null;
    InputCharacter q2 = null;

    Mark mark = source.mark();

    q1 = source.getInputCharacter();
    source.proceed();
    if (SingleCharacterParser.get().is(source)) {
      singleCharacter = SingleCharacterParser.get().parse(source);
    } else if (EscapeParser.is(source)) {
      escape = EscapeParser.parse(source);
    }
    if (source.isInputCharacter('\'')) {
      q2 = source.getInputCharacter();
      source.proceed();
    } else {
      throw new ParseException(source, "Single quote expected.");
    }

    if (singleCharacter != null) {
      return new CharacterLiteralImpl(q1, singleCharacter, q2,
          mark.getLine(), mark.getColumn());
    } else {
      return new CharacterLiteralImpl(q1, escape, q2,
          mark.getLine(), mark.getColumn());
    }
  }
}
