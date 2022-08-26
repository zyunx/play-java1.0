package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ClassModifiersParser {
  public static final ClassModifiersParser SINGLETON =
    new ClassModifiersParser();

  public static ClassModifiersParser get() {
    return SINGLETON;
  }

  public ClassModifiers parse(ThirdStepSource source) {
    Vector modifiers = new Vector();
    ClassModifierParser cmParser = ClassModifierParser.get();
    while (cmParser.is(source)) {
      modifiers.addElement(cmParser.parse(source));
    }
    return new ClassModifiers(modifiers);
  }
}
