package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Identifier extends Name {

  public Identifier(Name name) {
    super(name.getContent(), name.getLine(), name.getColumn());
    Assert.assertArg(is(name), "Not a identifier.");
  }

  public String toString() {
    return "<Identifier<" + getText() + ">>";
  }

  public static boolean is(Name name) {
    return !Keyword.is(name);
  }
}
