package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TypeName extends Name {

  public TypeName(Name name) {
    super(name.getContent(), name.getLine(), name.getColumn());
  }

  public boolean is(String name) {
   return name.equals(getText()); 
  }

  public String toString() {
    return "<TypeName<" + getText() + ">>";
  }
}
