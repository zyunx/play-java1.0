package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Keyword extends Name {

  public static final String[] KEYWORDS = {
    "abstract",
    "boolean", "break", "byte",
    "case", "cast", "catch", "char", "class", "const", "continue",
    "default", "do", "double",
    "else", "extends",
    "final", "finally", "float", "for", "future",
    "generic", "goto",
    "if", "implements", "import", "inner", "instanceof", "int", "interface",
    "long",
    "native", "new", "null",
    "operator", "outer",
    "package", "private", "protected", "public",
    "rest", "return",
    "short", "static", "static",
    "super", "switch", "synchronized",
    "this", "throw", "throws", "transient", "try",
    "var", "void", "volatile",
    "while"
  }; 
  public Keyword(Name name) {
    super(name.getContent(), name.getLine(), name.getColumn());
    Assert.assertArg(is(name), "Not a keyword.");
  }

  public boolean is(String name) {
   return name.equals(getText()); 
  }

  public String toString() {
    return "<Keyword<" + getText() + ">>";
  }

  public static boolean is(Name name) {
    for (int i = 0; i < KEYWORDS.length; i++) {
      String kw = KEYWORDS[i];
      if (kw.equals(name.getText())) {
        return true;
      }
    }
    return false;
  }
}
