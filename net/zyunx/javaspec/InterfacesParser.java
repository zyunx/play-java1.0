package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;

public class InterfacesParser {
  public static final InterfacesParser SINGLETON =
    new InterfacesParser();

  public static InterfacesParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    if (t instanceof Keyword) {
      Keyword k = (Keyword) t;
      return k.is("implements");
    }
    return false;
  }
  public Interfaces parse(ThirdStepSource source) {
    Assert.assertArg(is(source), "Interfaces expected");

    source.proceed();
    TypeNameList typeNameList = TypeNameListParser.get().parse(source);

    return new Interfaces(typeNameList);
  }
}
