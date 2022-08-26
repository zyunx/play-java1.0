package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class CharacterEscapeImplParser {
  public static boolean is(SecondStepSource source) {
    boolean result = false;
    Mark mark = source.mark();
    if (source.isInputCharacter('\\')) {
      source.proceed();
      if (source.isInputCharacter()) {
        char c = source.getInputCharacter().getChar();
        result =  c == 'b' || c == 't' || c == 'n' || c == 'f'
          || c == 'r' || c == '"' || c == '\'' || c == '\\';
      }
    }
    source.go(mark);
    return result;
  }
  public static CharacterEscapeImpl parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Character escape expected");
    InputCharacter backSlash = source.getInputCharacter();
    source.proceed();
    CharacterEscapeImpl escape = CharacterEscapeImpl.valueOf(
        source.getInputCharacter());
    source.proceed();
    return escape;
  }
}
