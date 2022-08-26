package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class VariableModifiersParser {
  public static final VariableModifiersParser SINGLETON =
    new VariableModifiersParser();

  public static VariableModifiersParser get() {
    return SINGLETON;
  }

  public VariableModifiers parse(ThirdStepSource source) {
    Vector modifiers = new Vector();
    VariableModifierParser cmParser = VariableModifierParser.get();
    while (cmParser.is(source)) {
      modifiers.addElement(cmParser.parse(source));
    }
    return new VariableModifiers(modifiers);
  }
}
