package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class CharactersInLineParser {

  public static boolean is(SecondStepSource source) {
    return !source.isLineTerminator();
  }

  public static CharactersInLine parse(SecondStepSource source) {
    if (!is(source)) {
      throw new ParseException(source, "Not a character in line");
    }
    CharactersInLine rst = new CharactersInLine();
    while (!source.isLineTerminator()) {
      rst.addInputCharacter(source.getInputCharacter());
      source.proceed();
    }
    return rst;
  }

}
