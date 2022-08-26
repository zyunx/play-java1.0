package net.zyunx.javaspec;

public class PackageOrTypeNameComponent {
  private Identifier identifier;

  public PackageOrTypeNameComponent(Identifier id) {
    identifier = id;
  }

  public PackageNameComponent asPackageNameComponent() {
    return new PackageNameComponent(identifier);
  }

  public Identifier getIdentifier() {
    return identifier;
  }
}
