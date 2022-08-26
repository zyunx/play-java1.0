package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class BooleanLiteral extends Name {
  // of InputCharacter
  public BooleanLiteral(Name name) {
    super(name.getContent(), name.getLine(), name.getColumn());
    Assert.assertArg(is(name), "Not a boolean literal.");
  }

  public String toString() {
    return "<BooleanLiteral<" + getText() + ">>";
  }
  public static boolean is(Name name) {
    return "true".equals(name.getText()) || "false".equals(name.getText());
  }
}
