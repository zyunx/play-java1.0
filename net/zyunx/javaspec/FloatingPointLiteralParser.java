package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class FloatingPointLiteralParser {
  public static boolean is(SecondStepSource source) {
    boolean result = false;
    Mark mark = source.mark();
    if (DigitsParser.is(source)) {
      DigitsParser.parse(source);
      if (source.isInputCharacter('.')) {
        result = true;
      } else {
        result = ExponentPartParser.is(source);
      }
    } else if (source.isInputCharacter('.')) {
      source.proceed();
      result = DigitsParser.is(source);
    }
    source.go(mark);
    return result;
  }
  public static FloatingPointLiteral parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Floating point literal expected");
    Mark mark = source.mark();

    Digits wholeNumberPart = null;
    InputCharacter dot = null;
    Digits fractionalPart = null;
    ExponentPart exponentPart = null;
    FloatTypeSuffix floatTypeSuffix = null;

    if (DigitsParser.is(source)) {
      wholeNumberPart = DigitsParser.parse(source);
      if (source.isInputCharacter('.')) {
        dot = source.getInputCharacter();
        source.proceed();
        if (DigitsParser.is(source)) {
          fractionalPart = DigitsParser.parse(source);
        }
        if (ExponentPartParser.is(source)) {
          exponentPart = ExponentPartParser.parse(source);
        }
      } else if (ExponentPartParser.is(source)) {
        exponentPart = ExponentPartParser.parse(source);
      } else {
        Assert.impossible("Invalid floating point literal.");
      }
    } else if (source.isInputCharacter('.')) {
      dot = source.getInputCharacter();
      source.proceed();
      fractionalPart = DigitsParser.parse(source);
      if (ExponentPartParser.is(source)) {
        exponentPart = ExponentPartParser.parse(source);
      }
    } else {
      Assert.impossible("Invalid floating point literal.");
    }

    if (FloatTypeSuffixParser.is(source)) {
      floatTypeSuffix = FloatTypeSuffixParser.parse(source);
    }
    return new FloatingPointLiteral(wholeNumberPart, dot,
        fractionalPart, exponentPart, floatTypeSuffix,
        mark.getLine(), mark.getColumn());
  }
}
