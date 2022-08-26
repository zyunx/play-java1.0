package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TypeNameListParser {
  public static final TypeNameListParser SINGLETON =
    new TypeNameListParser();

  public static TypeNameListParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    return TypeNameParser.get().is(source);
  }
  public TypeNameList parse(ThirdStepSource source) {
    Vector list = new Vector();
    TypeNameParser typeNameParser = TypeNameParser.get();

    list.addElement(typeNameParser.parse(source));
    while (true) {
      Token t = source.getToken();
      if (t instanceof Separator) {
        Separator s = (Separator) t;
        if (!s.isComma()) {
          break;
        }
      }
      source.proceed();

      if (!typeNameParser.is(source)) {
        throw new SyntaxException(source, "Type name expected.");
      }
      list.addElement(typeNameParser.parse(source));
    }

    return new TypeNameList(list);
  }
}
