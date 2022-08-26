package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;
import java.util.Vector;

public class CharacterEscapeImpl implements Escape {
  public static final CharacterEscapeImpl BS
    = new CharacterEscapeImpl("BS", '\b');
  public static final CharacterEscapeImpl HT
    = new CharacterEscapeImpl("HT", '\t');
  public static final CharacterEscapeImpl LF
    = new CharacterEscapeImpl("LF", '\n');
  public static final CharacterEscapeImpl FF
    = new CharacterEscapeImpl("FF", '\f');
  public static final CharacterEscapeImpl CR
    = new CharacterEscapeImpl("CR", '\r');
  public static final CharacterEscapeImpl DOUBLE_QUOTE
    = new CharacterEscapeImpl("DOUBLE_QUOTE", '"');
  public static final CharacterEscapeImpl SINGLE_QUOTE
    = new CharacterEscapeImpl("SINGLE_QUOTE", '\'');
  public static final CharacterEscapeImpl BACK_SLASH
    = new CharacterEscapeImpl("BACK_SLASH", '\\');

  public static CharacterEscapeImpl valueOf(InputCharacter c) {
    switch (c.getChar()) {
      case 'b':
        return BS;
      case 't':
        return HT;
      case 'n':
        return LF;
      case 'f':
        return FF;
      case 'r':
        return CR;
      case '\"':
        return DOUBLE_QUOTE;
      case '\'':
        return SINGLE_QUOTE;
      case '\\':
        return BACK_SLASH;
      default:
        Assert.impossible("Invalid escape character.");
        return null;
    }
  }

  private String name;
  private char value;

  private CharacterEscapeImpl(String name, char c) {
    this.name = name;
    value = c;
  } 

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<Escape<");
    sb.append(name);
    sb.append(">");
    return sb.toString();
  }
}
