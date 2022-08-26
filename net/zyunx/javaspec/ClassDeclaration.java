package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassDeclaration {

  private ClassModifiers modifiers;
  private Identifier name;
  private Super superClass;
  private Interfaces interfaces;
  private ClassBody body;

  public ClassDeclaration(ClassModifiers modifiers,
      Identifier name,
      Super superClass,
      Interfaces interfaces,
      ClassBody body) {
    this.modifiers = modifiers;
    this.name = name;
    this.superClass = superClass;
    this.interfaces = interfaces;
    this.body = body;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("ClassDeclaration<");
    sb.append(modifiers);
    sb.append(name);
    if (superClass != null) {
      sb.append(" extends ").append(superClass);
    }
    if (interfaces != null) {
      sb.append(" implements ").append(interfaces);
    }
    sb.append(body);
    sb.append(">");
    return sb.toString();
  }
}
