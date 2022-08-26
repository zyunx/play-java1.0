package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TypeNameParser {

  public static final TypeNameParser SINGLETON =
    new TypeNameParser();

  public static TypeNameParser get() {
    return SINGLETON;
  }
  public boolean is(ThirdStepSource source) {
    return (source.getToken() instanceof Name);
  }

  public TypeName parse(ThirdStepSource source) {
    if (!is(source)) {
      throw new SyntaxException(source, "Not a type name");
    }

    Name name = (Name) source.getToken();
    source.proceed();

    return new TypeName(name);
  }

}
