package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassModifier extends Keyword {

  public static final String[] CLASS_MODIFIERS = {
    "abstract",
    "final", 
    "public" 
  }; 
  public ClassModifier(Keyword keyword) {
    super(keyword);
    //super(keyword.getContent(), keyword.getLine(), keyword.getColumn());
    Assert.assertArg(is(keyword), "Not a class modifier.");
  }

  public boolean is(String name) {
   return name.equals(getText()); 
  }

  public String toString() {
    return "<ClassModifer<" + getText() + ">>";
  }

  public static boolean is(Keyword name) {
    for (int i = 0; i < CLASS_MODIFIERS.length; i++) {
      String kw = CLASS_MODIFIERS[i];
      if (kw.equals(name.getText())) {
        return true;
      }
    }
    return false;
  }
}
