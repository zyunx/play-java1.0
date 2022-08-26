package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class Comment extends SequenceInputElement {
  public Comment() {
  }
  public Comment(InputCharacter slash,
      InputCharacter star,
      NotStar notStar,
      TraditionalCommentTail tail) {
    content.addElement(slash);
    content.addElement(star);
    content.addElement(notStar);
    content.addElement(tail);
  }
  public Comment(InputCharacter slash1,
      InputCharacter slash2,
      CharactersInLine line,
      LineTerminator lineTerm) {
    content.addElement(slash1);
    content.addElement(slash2);
    content.addElement(line);
    content.addElement(lineTerm);
  }
  public Comment(InputCharacter slash1,
      InputCharacter slash2,
      LineTerminator lineTerm) {
    content.addElement(slash1);
    content.addElement(slash2);
    content.addElement(lineTerm);
  }

  public String toString() {
    return "<Comment>";
  }
}
