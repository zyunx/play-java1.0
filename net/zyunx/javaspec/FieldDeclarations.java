package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FieldDeclarations {
  private Vector fieldDeclarations;

  public FieldDeclarations(Vector fieldDeclarations) {
    this.fieldDeclarations = fieldDeclarations;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("FieldDeclarations<");
    for (int i = 0; i < fieldDeclarations.size(); i++) {
      FieldDeclaration t = (FieldDeclaration)
        fieldDeclarations.elementAt(i);
      sb.append(t);
    }
    sb.append(">");
    return sb.toString();
  }
}
