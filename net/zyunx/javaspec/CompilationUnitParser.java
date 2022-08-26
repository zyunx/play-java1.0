package net.zyunx.javaspec;

import java.util.Vector;

public class CompilationUnitParser {
  public static final CompilationUnitParser SINGLETON =
    new CompilationUnitParser();

  public static CompilationUnitParser get() {
    return SINGLETON;
  }
  public CompilationUnit parse(ThirdStepSource source) {
    PackageStatement pkgStmt = null;
    if (!source.isEnd() && PackageStatementParser.get().is(source)) {
      pkgStmt = PackageStatementParser.get().parse(source);
    }
    Vector imtStmts = new Vector();
    while (ImportStatementParser.get().is(source)) {
      imtStmts.addElement(ImportStatementParser.get().parse(source));
    }
    Vector classOrInterfaceDeclarations = new Vector();
    //while (ClassDeclarationParser.get().is(source)) {
      classOrInterfaceDeclarations.addElement(
          ClassDeclarationParser.get().parse(source));
    //} 
    return new CompilationUnit(pkgStmt, imtStmts,
        classOrInterfaceDeclarations);
  }
}
