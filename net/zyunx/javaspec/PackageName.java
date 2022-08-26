package net.zyunx.javaspec;

import java.util.Vector;

public class PackageName {
  private Vector packageNameComponents;

  public PackageName(Vector comps) {
    packageNameComponents = comps;
  }

  public Vector getComponents() {
    return packageNameComponents;
  }
}
