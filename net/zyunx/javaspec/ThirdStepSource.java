package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ThirdStepSource {
  private Vector inputElements;
  private Vector tokens;
  private int pos = 0;

  public ThirdStepSource(Vector inputElements) {
    Assert.assertArg(inputElements != null, "InputElements is null.");
    this.inputElements = inputElements;
    Vector ts = new Vector();
    for (int i = 0; i < inputElements.size(); i++) {
      Object e = inputElements.elementAt(i);
      if (e instanceof Token) {
        ts.addElement(e);
      }
    }
    tokens = ts;
  }

  public Token getToken() {
    return (Token) tokens.elementAt(pos);
  }

  public void proceed() {
    pos++;
  }
  public void back() {
    pos--;
  }
  public Mark mark() {
    return new Mark(pos);
  }
  public void go(Mark mark) {
    pos = mark.getPos();
  }
  public boolean isEnd() {
    return pos == tokens.size();
  }
  public Vector getInputElements() {
    return inputElements;
  }
}
