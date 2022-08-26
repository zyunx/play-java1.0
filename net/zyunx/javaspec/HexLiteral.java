package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class HexLiteral {
  private Vector hexDigits;

  public HexLiteral(Vector hexDigits) {
    this.hexDigits = hexDigits;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("0x");
    for (int i = 0; i < hexDigits.size(); i++) {
      sb.append(hexDigits.elementAt(i));
    }
    return sb.toString();
  }
}
