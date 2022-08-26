package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassModifiers {
  private Vector modifiers;

  public ClassModifiers(Vector modifiers) {
    this.modifiers = modifiers;
  }

  public Vector getModifiers() {
    return modifiers;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("ClassModifiers<");
    for (int i = 0; i < modifiers.size(); i++) {
      ClassModifier m = (ClassModifier) modifiers.elementAt(i);
      sb.append(m.getText()).append(" ");
    }
    sb.setLength(sb.length() - 1);
    sb.append(">");
    return sb.toString();
  }
}
