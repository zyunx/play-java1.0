package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Super {
  private TypeName typeName;

  public Super(TypeName typeName) {
    this.typeName = typeName;
  }

  public String toString() {
    return "TypeName<" + typeName.getText() + ">";
  }

}
