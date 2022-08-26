package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TraditionalCommentTail extends SequenceInputElement {
  
  public TraditionalCommentTail() {
  }

  public TraditionalCommentTail(InputCharacter star,
      InputCharacter slash) {
    content.addElement(star);
    content.addElement(slash);
  }

  public TraditionalCommentTail(NotStar notStar,
      TraditionalCommentTail tail) {
    content.addElement(notStar);
    content.addElement(tail);
  }

  public TraditionalCommentTail(InputCharacter star,
      NotSlash notSlash,
      TraditionalCommentTail tail) {
    content.addElement(star);
    content.addElement(notSlash);
    content.addElement(tail);
  }

  public String toString() {
    return "<TraditionalCommentTail>";
  }
}
