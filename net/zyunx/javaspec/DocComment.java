package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DocComment extends Comment {
  public DocComment() {
  }
  public DocComment(InputCharacter slash,
      InputCharacter star1,
      InputCharacter star2,
      DocCommentTail tail) {
    content.addElement(slash);
    content.addElement(star1);
    content.addElement(star2);
    content.addElement(tail);
  }
  public String toString() {
    return "<DocComment>";
  }
}
