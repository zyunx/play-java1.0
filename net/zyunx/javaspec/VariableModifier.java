package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class VariableModifier extends Keyword {

  public static final String[] VARIABLE_MODIFIERS = {
    "public", "protected", "private",
    "static", "final", "transient", "volatile" 
  }; 
  public VariableModifier(Keyword keyword) {
    super(keyword);
    Assert.assertArg(is(keyword), "Not a variable modifier.");
  }

  public boolean is(String name) {
   return name.equals(getText()); 
  }

  public String toString() {
    return "<VariableModifer<" + getText() + ">>";
  }

  public static boolean is(Keyword name) {
    for (int i = 0; i < VARIABLE_MODIFIERS.length; i++) {
      String kw = VARIABLE_MODIFIERS[i];
      if (kw.equals(name.getText())) {
        return true;
      }
    }
    return false;
  }
}
