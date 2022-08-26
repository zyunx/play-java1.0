package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class SequenceInputElement extends InputElement {

  protected Vector content = new Vector();

  public Vector getContent() {
    return content;
  }

  public int getSize() {
    int size = 0;
    for (int i = 0; i < content.size(); i++) {
      Object e = content.elementAt(i);
      if (e instanceof InputCharacter) {
        size++;
      } if (e instanceof LineTerminator) {
        size++;
      } else if (e instanceof InputElement) {
        size += ((InputElement) e).getSize();
      } else {
        Assert.impossible(e + "is not an invalid element.");
      }
    }
    return size;
  }
}
