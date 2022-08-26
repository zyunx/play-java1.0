package net.zyunx.javaspec;

import java.util.Vector;

public class PackageOrTypeImportStatement implements ImportStatement {
  private PackageOrTypeName packageOrTypeName;

  public PackageOrTypeImportStatement(PackageOrTypeName name) {
    packageOrTypeName = name;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<PackageOrTypeImportStatement<");
    Vector comps = packageOrTypeName.getComponents();
    sb.append(((PackageOrTypeNameComponent) comps.elementAt(0))
        .getIdentifier().getText());
    for (int i = 1; i < comps.size(); i++) {
      sb.append(".")
        .append(((PackageOrTypeNameComponent) comps.elementAt(i))
        .getIdentifier().getText());
    }
    sb.append(">>");
    return sb.toString();
  }
}
