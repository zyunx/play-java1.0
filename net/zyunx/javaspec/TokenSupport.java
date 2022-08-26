package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public abstract class TokenSupport implements Token {
  private int line;
  private int column;

  public TokenSupport(int line, int column) {
    this.line = line;
    this.column = column;
  }
  public int getLine() {
    return line;
  }
  public int getColumn() {
    return column;
  }
}
