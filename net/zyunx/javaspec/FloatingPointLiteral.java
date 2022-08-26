package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;
import java.util.Vector;

public class FloatingPointLiteral extends TokenSupport
  implements Literal {

  private Digits wholeNumberPart;
  private InputCharacter dot;
  private Digits fractionalPart;
  private ExponentPart exponentPart;
  private FloatTypeSuffix floatTypeSuffix;

  public FloatingPointLiteral(Digits wholeNumberPart, InputCharacter dot,
      Digits fractionalPart, ExponentPart exponentPart,
      FloatTypeSuffix floatTypeSuffix,
      int line, int column) {
    super(line, column);
    this.wholeNumberPart = wholeNumberPart;
    this.dot = dot;
    this.fractionalPart = fractionalPart;
    this.exponentPart = exponentPart;
    this.floatTypeSuffix = floatTypeSuffix;
  }

  public String getText() {
    throw new UnsupportedOperationException();
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<FloatingPointLiteral<");
    if (wholeNumberPart != null) {
      sb.append(wholeNumberPart);
    } 
    if (dot != null) {
      sb.append(dot);
    }
    if (fractionalPart != null) {
      sb.append(fractionalPart);
    }
    if (exponentPart != null) {
      sb.append(exponentPart);
    }
    sb.append(floatTypeSuffix != null ? floatTypeSuffix.toString() : "");
    sb.append(">");
    return sb.toString();
  }
}
