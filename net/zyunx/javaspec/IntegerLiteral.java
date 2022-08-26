package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;
import java.util.Vector;

public class IntegerLiteral extends TokenSupport implements Literal {
  private DecimalLiteral decimalLiteral;
  private OctalLiteral octalLiteral;
  private HexLiteral hexLiteral;
  private IntegerTypeSuffix typeSuffix;

  public IntegerLiteral(DecimalLiteral dl, IntegerTypeSuffix ts,
      int line, int column) {
    super(line, column);
    decimalLiteral = dl;
    typeSuffix = ts;
  }
  public IntegerLiteral(HexLiteral hl, IntegerTypeSuffix ts,
      int line, int column) {
    super(line, column);
    hexLiteral = hl;
    typeSuffix = ts;
  }
  public IntegerLiteral(OctalLiteral al, IntegerTypeSuffix ts,
      int line, int column) {
    super(line, column);
    octalLiteral = al;
    typeSuffix = ts;
  }
  public String getText() {
    throw new UnsupportedOperationException();
  }
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<IntegerLiteral<");
    if (decimalLiteral != null) {
      sb.append(decimalLiteral);
    } else if (octalLiteral != null) {
      sb.append(octalLiteral);
    } else if (hexLiteral != null) {
      sb.append(hexLiteral);
    }
    sb.append(typeSuffix != null ? typeSuffix.toString() : "");
    sb.append(">");
    return sb.toString();
  }
}
