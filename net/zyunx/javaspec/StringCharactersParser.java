package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class StringCharactersParser {
  public static final StringCharactersParser SINGLETON =
    new StringCharactersParser();

  public static StringCharactersParser get() {
    return SINGLETON;
  }

  public boolean is(SecondStepSource source) {
    return StringCharacterParser.get().is(source);
  }
  public StringCharacters parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "String characters expected");
    Vector str = new Vector();
    StringCharacterParser stringCharParser = StringCharacterParser.get();
    while (stringCharParser.is(source)) {
      str.addElement(stringCharParser.parse(source));
    }
    return new StringCharactersImpl(str);
  }
}
