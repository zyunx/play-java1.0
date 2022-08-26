package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class MultilineComment extends Comment {
  public MultilineComment(InputCharacter slash,
      InputCharacter star,
      NotStar notStar,
      TraditionalCommentTail tail) {
    content.addElement(slash);
    content.addElement(star);
    content.addElement(notStar);
    content.addElement(tail);
  }
  public String toString() {
    return "<MultilineComment>";
  }
}
