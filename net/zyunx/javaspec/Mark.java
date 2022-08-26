package net.zyunx.javaspec;

import net.zyunx.common.Assert;

public class Mark {
  private int pos;
  private int line;
  private int column;

  public Mark(int pos) {
    this.pos = pos;
  }
  public Mark(int pos, int line, int column) {
    this.pos = pos;
    this.line = line;
    this.column = column;
  }

  public int getPos() {
    return pos;
  }
  public int getLine() {
    return line;
  }
  public int getColumn() {
    return column;
  }
}
