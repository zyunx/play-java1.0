package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DigitsParser {
  public static boolean is(SecondStepSource source) {
    return DigitParser.is(source);
  }
  public static boolean is(SecondStepSource source, int pos) {
    return DigitParser.is(source, pos);
  }
  public static Digits parse(SecondStepSource source) {
    Vector ds = new Vector();
    while (DigitParser.is(source)) {
      Digit d = DigitParser.parse(source);
      ds.addElement(d);
    }
    return new Digits(ds);
  }
}
