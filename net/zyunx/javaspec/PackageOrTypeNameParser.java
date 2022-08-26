package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class PackageOrTypeNameParser {
  public static final PackageOrTypeNameParser SINGLETON =
    new PackageOrTypeNameParser();

  public static PackageOrTypeNameParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    return PackageOrTypeNameComponentParser.get().is(source);
  }

  public PackageOrTypeName parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "PackageOrTypeNameComponent expected.");
    PackageOrTypeName result = null;

    Vector comps = new Vector();
    PackageOrTypeNameComponentParser comParser =
      PackageOrTypeNameComponentParser.get();
    comps.addElement(comParser.parse(source));

    Mark mark = null;
    while (true) {
      mark = source.mark();

      Object token = source.getToken();
      if (token instanceof Separator) {
        Separator sep = (Separator) token;
        if (!sep.isDot()) {
          break;
        }
        source.proceed();
      }

      if (comParser.is(source)) {
        comps.addElement(comParser.parse(source));
      } else {
        break;
      }
    }
    source.go(mark);

    return new PackageOrTypeName(comps); 
  }
}
