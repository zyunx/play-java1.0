package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;

public class SuperParser {
  public static final SuperParser SINGLETON =
    new SuperParser();

  public static SuperParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    Token t = source.getToken();
    if (t instanceof Keyword) {
      Keyword k = (Keyword) t;
      return k.is("extends");
    }
    return false;
  }
  public Super parse(ThirdStepSource source) {
    Assert.assertArg(is(source), "Super expected");

    source.proceed();
    TypeName typeName = TypeNameParser.get().parse(source);

    return new Super(typeName);
  }
}
