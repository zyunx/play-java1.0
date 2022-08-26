package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class PackageNameComponentParser {
  public static final PackageNameComponentParser SINGLETON =
    new PackageNameComponentParser();

  public static PackageNameComponentParser get() {
    return SINGLETON;
  }
  public boolean is(ThirdStepSource source) {
    Object token = source.getToken();
    return (token instanceof Identifier);
  }

  public PackageNameComponent parse(ThirdStepSource source) {
    Assert.assertTrue(is(source), "Identifier expected.");
    PackageNameComponent result = null;

    Object token = source.getToken();
    source.proceed();

    return new PackageNameComponent((Identifier) token); 
  }
}
