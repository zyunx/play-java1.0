package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OctalLiteral {
  private Vector octalDigits;

  public OctalLiteral(Vector octalDigits) {
    this.octalDigits = octalDigits;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < octalDigits.size(); i++) {
      sb.append(octalDigits.elementAt(i));
    }
    return sb.toString();
  }
}
