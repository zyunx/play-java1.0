package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NameParser {

  public static boolean is(SecondStepSource source) {
    int pos = source.getPos();
    Object first = source.getCharacterAt(pos);
    if (first instanceof LineTerminator) {
      return false;
    }
    return UnicodeLetter.is((InputCharacter) first);
  }

  public static Name parse(SecondStepSource source) {
    if (!is(source)) {
      throw new ParseException(source, "Not a name");
    }

    Mark mark = source.mark();

    Vector chars = new Vector();
    chars.addElement(source.getInputCharacter());
    source.proceed();

    while (!source.isEnd()
        && !source.isLineTerminator()
        && (UnicodeLetter.is(source.getInputCharacter())
          || UnicodeDigit.is(source.getInputCharacter()))) {
      chars.addElement(source.getInputCharacter());
      source.proceed();
    }
    return new Name(chars, mark.getLine(), mark.getColumn());
  }

}
