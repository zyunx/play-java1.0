package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SeparatorParser {
  public static final SeparatorParser SINGLETON =
    new SeparatorParser();

  public static SeparatorParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    boolean result = false;
    if (source.isInputCharacter()) {
      result = SeparatorImpl.is(
          source.getInputCharacter());
    }
    return result;
  }
  public Separator parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Separator expected");
    Mark mark = source.mark();

    InputCharacter c = source.getInputCharacter();
    source.proceed();
    return new SeparatorImpl(c, mark.getLine(), mark.getColumn());
  }
}
