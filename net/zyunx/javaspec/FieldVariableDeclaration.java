package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FieldVariableDeclaration implements FieldDeclaration {

  private VariableModifiers modifiers;
  private Type type;
  private VariableDeclarators declarators;

  public FieldVariableDeclaration(
      VariableModifiers modifiers,
      Type type,
      VariableDeclarators declarators) {
    this.modifiers = modifiers;
    this.type = type;
    this.declarators = declarators;
  }

  public String toString() {
    return "FieldVariableDeclaration<" + "" + ">";
  }
}
