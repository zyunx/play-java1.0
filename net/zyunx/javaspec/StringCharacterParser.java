package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class StringCharacterParser {
  public static final StringCharacterParser SINGLETON =
    new StringCharacterParser();

  public static StringCharacterParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    boolean result = false;
    if (source.isInputCharacter()) {
      result = InputCharacterStringCharacterImpl.is(
          source.getInputCharacter());
    }
    if (EscapeParser.is(source)) {
      result = true;
    }
    return result;
  }
  public StringCharacter parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "String character expected");
    InputCharacter c = source.getInputCharacter();
    if (InputCharacterStringCharacterImpl.is(c)) {
      source.proceed();
      return new InputCharacterStringCharacterImpl(c);
    }
    return EscapeParser.parse(source);
  }
}
