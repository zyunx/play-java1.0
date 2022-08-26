package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FieldVariableDeclarationParser {
  public static final FieldVariableDeclarationParser SINGLETON =
    new FieldVariableDeclarationParser();

  public static FieldVariableDeclarationParser get() {
    return SINGLETON;
  }

  public FieldVariableDeclaration parse(ThirdStepSource source) {
    VariableModifiers modifiers =
      VariableModifiersParser.get().parse(source);
    Type type = null;
    VariableDeclarators declarators = null;
    return new FieldVariableDeclaration(modifiers, type, declarators);
  }
}
