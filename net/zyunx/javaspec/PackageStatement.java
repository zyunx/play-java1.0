package net.zyunx.javaspec;

import java.util.Vector;

public class PackageStatement {
  private PackageName packageName;

  public PackageStatement(PackageName name) {
    packageName = name;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<PackageStatement<");
    Vector comps = packageName.getComponents();
    sb.append(((PackageNameComponent) comps.elementAt(0))
        .getIdentifier().getText());
    for (int i = 1; i < comps.size(); i++) {
      sb.append(".")
        .append(((PackageNameComponent) comps.elementAt(i))
        .getIdentifier().getText());
    }
    sb.append(">>");
    return sb.toString();
  }
}
