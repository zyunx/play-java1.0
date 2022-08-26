package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class IntegerLiteralParser {
  public static boolean is(SecondStepSource source) {
    return DecimalLiteralParser.is(source)
      || HexLiteralParser.is(source)
      || OctalLiteralParser.is(source);
  }
  public static IntegerLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Integer literal expected");
    Mark mark = source.mark();

    if (DecimalLiteralParser.is(source)) {
      DecimalLiteral dl = DecimalLiteralParser.parse(source);
      IntegerTypeSuffix ts = null;
      if (IntegerTypeSuffixParser.is(source)) {
        ts = IntegerTypeSuffixParser.parse(source);
      }
      return new IntegerLiteral(dl, ts, mark.getLine(), mark.getColumn());
    } else if (HexLiteralParser.is(source)) {
      HexLiteral hl = HexLiteralParser.parse(source);
      IntegerTypeSuffix ts = null;
      if (IntegerTypeSuffixParser.is(source)) {
        ts = IntegerTypeSuffixParser.parse(source);
      }
      return new IntegerLiteral(hl, ts, mark.getLine(), mark.getColumn());
    } else if (OctalLiteralParser.is(source)) {
      OctalLiteral al = OctalLiteralParser.parse(source);
      IntegerTypeSuffix ts = null;
      if (IntegerTypeSuffixParser.is(source)) {
        ts = IntegerTypeSuffixParser.parse(source);
      }
      return new IntegerLiteral(al, ts, mark.getLine(), mark.getColumn());
    }
    Assert.impossible("Impossible");
    return null;
  }
}
