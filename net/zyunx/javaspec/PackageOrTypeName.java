package net.zyunx.javaspec;

import java.util.Vector;

public class PackageOrTypeName {
  private Vector packageOrTypeNameComponents;

  public PackageOrTypeName(Vector comps) {
    packageOrTypeNameComponents = comps;
  }

  public PackageName asPackageName() {
    Vector pncs = new Vector();
    for (int i = 0; i < packageOrTypeNameComponents.size(); i++) {
      PackageOrTypeNameComponent c = (PackageOrTypeNameComponent)
        packageOrTypeNameComponents.elementAt(i);
      //System.out.println("DEBUG: " + packageOrTypeNameComponents.elementAt(i).getClass().getName());
      pncs.addElement(c.asPackageNameComponent());
    }
    return new PackageName(pncs);
  }

  public Vector getComponents() {
    return packageOrTypeNameComponents;
  }
}
