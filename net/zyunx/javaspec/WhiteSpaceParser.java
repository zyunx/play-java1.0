package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class WhiteSpaceParser {
  public static boolean is(SecondStepSource source) {
    int pos = source.getPos();
    Object c = source.getCharacterAt(pos);
    if (c instanceof InputCharacter) {
      InputCharacter inputChar = (InputCharacter) c;
      char ch = inputChar.getChar();
      return (ch == ' ' || ch == '\t' || ch == '\f'); 
    } else {
      // LineTerminator
      return true;
    }
  }
  public static WhiteSpace parse(SecondStepSource source) {
    if (is(source)) {
      Object c = source.getCharacter();
      if (c instanceof InputCharacter) {
        source.proceed();
        return new WhiteSpace((InputCharacter) c);
      } else {
        source.proceed();
        return new WhiteSpace((LineTerminator) c);
      }
    } else {
      throw new ParseException(source, "White space expected");
    }
  }
}
