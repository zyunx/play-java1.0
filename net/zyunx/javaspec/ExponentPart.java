package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ExponentPart {
  private ExponentIndicator exponentIndicator;
  private SignedInteger signedInteger;

  public ExponentPart(ExponentIndicator ei, SignedInteger si) {
    exponentIndicator = ei;
    signedInteger = si;
  }

  public String toString() {
    return exponentIndicator.toString() + signedInteger.toString();
  }
}
