package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class EscapeParser {
  public static boolean is(SecondStepSource source) {
    return OctalEscapeParser.is(source)
      || CharacterEscapeImplParser.is(source);
  }
  public static Escape parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Escape expected");
    if (OctalEscapeParser.is(source)) {
      return OctalEscapeParser.parse(source);
    } else if (CharacterEscapeImplParser.is(source)) {
      return CharacterEscapeImplParser.parse(source);
    } else {
      Assert.impossible("Escape parse bug.");
      return null;
    }
  }
}
