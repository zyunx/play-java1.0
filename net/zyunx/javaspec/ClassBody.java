package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassBody {
  private FieldDeclarations fieldDeclarations;

  public ClassBody(FieldDeclarations fieldDeclarations) {
    this.fieldDeclarations = fieldDeclarations;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("ClassBody<").append(fieldDeclarations).append(">");
    return sb.toString();
  }
}
