package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Interfaces {
  private TypeNameList typeNameList;

  public Interfaces(TypeNameList typeNameList) {
    this.typeNameList = typeNameList;
  }

  public String toString() {
    return "Interfaces<" + typeNameList + ">";
  }
}
