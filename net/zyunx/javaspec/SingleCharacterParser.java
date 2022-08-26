package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SingleCharacterParser {
  public static final SingleCharacterParser SINGLETON =
    new SingleCharacterParser();

  public static SingleCharacterParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    boolean result = false;
    if (source.isInputCharacter()) {
      result = SingleCharacterImpl.is(source.getInputCharacter());
    }
    return result;
  }
  public SingleCharacter parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Single character expected");
    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new SingleCharacterImpl(c);
  }
}
