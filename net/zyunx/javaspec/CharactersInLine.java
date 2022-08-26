package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class CharactersInLine extends SequenceInputElement {
  public void addInputCharacter(InputCharacter c) {
    content.addElement(c);
  }
}
