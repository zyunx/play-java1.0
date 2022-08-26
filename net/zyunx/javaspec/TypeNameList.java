package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TypeNameList {
  private Vector typeNameList;

  public TypeNameList(Vector typeNameList) {
    this.typeNameList = typeNameList;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("TypeNameList<");
    for (int i = 0; i < typeNameList.size(); i++) {
      TypeName t = (TypeName) typeNameList.elementAt(i);
      sb.append(t.getText()).append(",");
    }
    sb.setLength(sb.length() - 1);
    sb.append(">");
    return sb.toString();
  }
}
