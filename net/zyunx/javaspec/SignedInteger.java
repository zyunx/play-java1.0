package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SignedInteger {
  private Sign sign;
  private Digits digits;

  public SignedInteger(Sign sign, Digits digits) {
    this.sign = sign;
    this.digits = digits;
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append(sign != null ? sign.toString() : "");
    sb.append(digits);
    return sb.toString();
  }
}
