package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class PackageNameParser {
  public static final PackageNameParser SINGLETON =
    new PackageNameParser();

  public static PackageNameParser get() {
    return SINGLETON;
  }

  public boolean is(ThirdStepSource source) {
    return PackageNameComponentParser.get().is(source);
  }

  public PackageName parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "PackageNameComponent expected.");
    PackageName result = null;

    Vector comps = new Vector();
    PackageNameComponentParser comParser = PackageNameComponentParser.get();

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

      comps.addElement(comParser.parse(source));
    }
    source.go(mark);

    return new PackageName(comps); 
  }
}
