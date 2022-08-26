package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class PackageOrTypeNameComponentParser {
  public static final PackageOrTypeNameComponentParser SINGLETON =
    new PackageOrTypeNameComponentParser();

  public static PackageOrTypeNameComponentParser get() {
    return SINGLETON;
  }
  public boolean is(ThirdStepSource source) {
    Object token = source.getToken();
    return (token instanceof Identifier);
  }

  public PackageOrTypeNameComponent parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "Identifier expected.");
    PackageOrTypeNameComponent result = null;

    Object token = source.getToken();
    source.proceed();

    return new PackageOrTypeNameComponent((Identifier) token); 
  }
}
