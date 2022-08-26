package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OperatorParser {
  public static final OperatorParser SINGLETON =
    new OperatorParser();

  public static OperatorParser get() {
    return SINGLETON;
  }

  private static final OperatorImpl[] PARSE_ORDER = {
    OperatorImpl.TRIPLE_GREATER_EQUAL,
    OperatorImpl.TRIPLE_GREATER,
    OperatorImpl.DOUBLE_LESS_EQUAL,
    OperatorImpl.DOUBLE_GREATER_EQUAL,
    OperatorImpl.DOUBLE_EQUAL,
    OperatorImpl.LESS_EQUAL,
    OperatorImpl.GREATER_EQUAL,
    OperatorImpl.NOT_EQUAL,
    OperatorImpl.DOUBLE_ESPERLUETTE,
    OperatorImpl.DOUBLE_BAR,
    OperatorImpl.DOUBLE_PLUS,
    OperatorImpl.DOUBLE_HYPHEN,
    OperatorImpl.DOUBLE_LESS,
    OperatorImpl.DOUBLE_GREATER,
    OperatorImpl.PLUS_EQUAL,
    OperatorImpl.HYPHEN_EQUAL,
    OperatorImpl.STAR_EQUAL,
    OperatorImpl.SLASH_EQUAL,
    OperatorImpl.ESPERLUETTE_EQUAL,
    OperatorImpl.BAR_EQUAL,
    OperatorImpl.CARET_EQUAL,
    OperatorImpl.PERCENT_EQUAL,
    OperatorImpl.EQUAL,
    OperatorImpl.GREATER,
    OperatorImpl.LESS,
    OperatorImpl.EXCLAMATION,
    OperatorImpl.APPROXIMATELY,
    OperatorImpl.QUESTION,
    OperatorImpl.COLON,
    OperatorImpl.PLUS,
    OperatorImpl.HYPHEN,
    OperatorImpl.STAR,
    OperatorImpl.SLASH,
    OperatorImpl.ESPERLUETTE,
    OperatorImpl.BAR,
    OperatorImpl.CARET,
    OperatorImpl.PERCENT
  };

  public boolean is(SecondStepSource source) {
    for (int i = 0; i < PARSE_ORDER.length; i++) {
      if (isText(source, PARSE_ORDER[i].getText())) {
        return true;
      }
    }
    return false;
  }
  public Operator parse(SecondStepSource source) {
    Assert.assertTrue(is(source), "Operator expected");
    Mark mark = source.mark();

    for (int i = 0; i < PARSE_ORDER.length; i++) {
      OperatorImpl op = PARSE_ORDER[i];
      if (isText(source, op.getText())) {
        for (int j = 0; j < op.getText().length(); j++) {
          source.proceed();
        }
        return new OperatorImpl(op.getText(),
            mark.getLine(), mark.getColumn());
      }
    }
    Assert.impossible("Operator expected.");
    return null;
  }

  public boolean isText(SecondStepSource source, String text) {
    boolean result = true;
    int pos = source.getPos();
    for (int i = 0; i < text.length(); i++) {
      if (!source.isInputCharacterAt(pos+i, text.charAt(i))) {
        result = false;
        break;
      }
    }
    return result;
  }
}
