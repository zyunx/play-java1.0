package net.zyunx.javaspec;

import java.util.Vector;

public class CompilationUnit {
  private PackageStatement packageStatement;
  private Vector importStatements;
  private Vector classOrInterfaceDeclarations;

  public CompilationUnit(PackageStatement pkgStmt,
      Vector imtStmts, Vector classOrInterfaceDeclarations) {
    packageStatement = pkgStmt;
    importStatements = imtStmts;
    this.classOrInterfaceDeclarations = classOrInterfaceDeclarations;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append(packageStatement)
      .append("\n");
    for (int i = 0; i < importStatements.size(); i++) {
      sb.append(importStatements.elementAt(i)).append("\n");
    }
    for (int i = 0; i < classOrInterfaceDeclarations.size(); i++) {
      sb.append(classOrInterfaceDeclarations.elementAt(i)).append("\n");
    }
    return sb.toString();
  }
}
