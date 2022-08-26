package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Name extends TokenSupport implements Token {

  private String text;
  private Vector content;

  public Name(Vector inputCharacters, int line, int column) {
    super(line, column);
    content = inputCharacters;
    Assert.assertArg(content != null, "Input characters can't be null.");
    Assert.assertArg(content.size() > 0,
        "Input characters can't be empty.");
    InputCharacter first = (InputCharacter) content.elementAt(0);
    Assert.assertArg(UnicodeLetter.is(first),
        "First input char is not a unicode letter.");

    StringBuffer sb = new StringBuffer();
    sb.append(first);
    for (int i = 1; i < content.size(); i++) {
      Assert.assertArg(content.elementAt(i) instanceof InputCharacter,
          "Not a input character");
      InputCharacter c = (InputCharacter) content.elementAt(i);
      Assert.assertArg(UnicodeLetter.is(c) || UnicodeDigit.is(c),
          "Not a unicode letter or digit");
      sb.append(c.getChar());
    }
    text = sb.toString();
  }

  public String getText() {
    return text;
  }
  public Vector getContent() {
    return content;
  }

  public String toString() {
    return "<Name<" + text + ">>";
  }
}
