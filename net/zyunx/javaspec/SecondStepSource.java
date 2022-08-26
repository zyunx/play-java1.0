package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;
import net.zyunx.common.IllegalStateException;

public class SecondStepSource {
  private Vector source = new Vector();
  private int pos;
  private int line;
  private int column;

  public SecondStepSource(Vector src) {
    source = src;
  }

  public boolean isEnd() {
    return pos >= source.size();
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
  public Object getCharacter() {
    return source.elementAt(pos);
  }
  public void proceed() {
    if (getCharacter() instanceof LineTerminator) {
      line++;
      column = -1;
    }
    pos++;
    column++;
  }
  public Mark mark() {
    return new Mark(pos, line, column);
  }
  public void go(Mark mark) {
    pos = mark.getPos();
    line = mark.getLine();
    column = mark.getColumn();
  }

  public Object getCharacterAt(int p) {
    return source.elementAt(p);
  }

  public InputCharacter getInputCharacterAt(int p) {
    return (InputCharacter) source.elementAt(p);
  }
  public InputCharacter getInputCharacter() {
    return getInputCharacterAt(pos);
  }
  public boolean isInputCharacter() {
    return !isLineTerminator();
  }
  public boolean isInputCharacter(char c) {
    return isInputCharacterAt(pos, c);
  }
  public boolean isInputCharacterAt(int p) {
    return !isLineTerminatorAt(p);
  }
  public boolean isInputCharacterAt(int p, char c) {
    if (isLineTerminatorAt(p)) {
      return false;
    } else {
      return getInputCharacterAt(p).getChar() == c;
    }
  }
  public boolean isLineTerminatorAt(int p) {
    return source.elementAt(p) instanceof LineTerminator;
  }
  public boolean isLineTerminator() {
    return isLineTerminatorAt(pos);
  }
  public LineTerminator getLineTerminatorAt(int p) {
    return (LineTerminator) source.elementAt(p);
  }
  public LineTerminator getLineTerminator() {
    return getLineTerminatorAt(pos);
  }
}
