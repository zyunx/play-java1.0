package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Digits {
  private Vector digits = new Vector();
  public Digits(Vector ds) {
    digits = ds;
  }
  public Vector getDigits() {
    return digits;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < digits.size(); i++) {
      sb.append(digits.elementAt(i));
    }
    return sb.toString();
  }
}
