package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class OperatorImpl extends TokenSupport implements Operator {
  public static final OperatorImpl EQUAL =
    new OperatorImpl("=");
  public static final OperatorImpl GREATER =
    new OperatorImpl(">");
  public static final OperatorImpl LESS =
    new OperatorImpl("<");
  public static final OperatorImpl EXCLAMATION =
    new OperatorImpl("!");
  public static final OperatorImpl APPROXIMATELY =
    new OperatorImpl("~");
  public static final OperatorImpl QUESTION =
    new OperatorImpl("?");
  public static final OperatorImpl COLON =
    new OperatorImpl(":");
  public static final OperatorImpl DOUBLE_EQUAL =
    new OperatorImpl("==");
  public static final OperatorImpl LESS_EQUAL =
    new OperatorImpl("<=");
  public static final OperatorImpl GREATER_EQUAL =
    new OperatorImpl(">=");
  public static final OperatorImpl NOT_EQUAL =
    new OperatorImpl("!=");
  public static final OperatorImpl DOUBLE_ESPERLUETTE =
    new OperatorImpl("&&");
  public static final OperatorImpl DOUBLE_BAR =
    new OperatorImpl("||");
  public static final OperatorImpl DOUBLE_PLUS =
    new OperatorImpl("++");
  public static final OperatorImpl DOUBLE_HYPHEN =
    new OperatorImpl("--");
  public static final OperatorImpl PLUS =
    new OperatorImpl("+");
  public static final OperatorImpl HYPHEN =
    new OperatorImpl("-");
  public static final OperatorImpl STAR =
    new OperatorImpl("*");
  public static final OperatorImpl SLASH =
    new OperatorImpl("/");
  public static final OperatorImpl ESPERLUETTE =
    new OperatorImpl("&");
  public static final OperatorImpl BAR =
    new OperatorImpl("|");
  public static final OperatorImpl CARET =
    new OperatorImpl("^");
  public static final OperatorImpl PERCENT =
    new OperatorImpl("%");
  public static final OperatorImpl DOUBLE_LESS =
    new OperatorImpl("<<");
  public static final OperatorImpl DOUBLE_GREATER =
    new OperatorImpl(">>");
  public static final OperatorImpl TRIPLE_GREATER =
    new OperatorImpl(">>>");
  public static final OperatorImpl PLUS_EQUAL =
    new OperatorImpl("+=");
  public static final OperatorImpl HYPHEN_EQUAL =
    new OperatorImpl("-=");
  public static final OperatorImpl STAR_EQUAL =
    new OperatorImpl("*=");
  public static final OperatorImpl SLASH_EQUAL =
    new OperatorImpl("/=");
  public static final OperatorImpl ESPERLUETTE_EQUAL =
    new OperatorImpl("&=");
  public static final OperatorImpl BAR_EQUAL =
    new OperatorImpl("|=");
  public static final OperatorImpl CARET_EQUAL =
    new OperatorImpl("^=");
  public static final OperatorImpl PERCENT_EQUAL =
    new OperatorImpl("%=");
  public static final OperatorImpl DOUBLE_LESS_EQUAL =
    new OperatorImpl("<<=");
  public static final OperatorImpl DOUBLE_GREATER_EQUAL =
    new OperatorImpl(">>=");
  public static final OperatorImpl TRIPLE_GREATER_EQUAL =
    new OperatorImpl(">>>=");

  private String text;

  private OperatorImpl(String text) {
    super(0, 0);
    this.text = text;
  }
  public OperatorImpl(String text, int line, int column) {
    super(line, column);
    this.text = text;
  }

  public String getText() {
    return text;
  }
  public String toString() {
    return getText();
  }
}
