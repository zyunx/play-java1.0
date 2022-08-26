package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FieldDeclarationsParser {
  public static final FieldDeclarationsParser SINGLETON =
    new FieldDeclarationsParser();

  public static FieldDeclarationsParser get() {
    return SINGLETON;
  }

  public FieldDeclarations parse(ThirdStepSource source) {
    Vector ds = new Vector();
    FieldDeclarationParser fdParser = FieldDeclarationParser.get();
    //while (fdParser.is(source)) {
      ds.addElement(fdParser.parse(source));
    //}
    return new FieldDeclarations(ds);
  }
}
