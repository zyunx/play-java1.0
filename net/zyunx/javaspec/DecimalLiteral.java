package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DecimalLiteral {
  private NonZeroDigit nonZeroDigit;
  private Digits digits;

  public DecimalLiteral(NonZeroDigit nzd, Digits ds) {
    nonZeroDigit = nzd;
    digits = ds;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append(nonZeroDigit);
    for (int i = 0; i < digits.getDigits().size(); i++) {
      sb.append(digits.getDigits().elementAt(i));
    }
    return sb.toString();
  }
}
