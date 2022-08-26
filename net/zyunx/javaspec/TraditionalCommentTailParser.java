package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TraditionalCommentTailParser {
  public static TraditionalCommentTail parse(SecondStepSource source) {
    Vector chars = new Vector();
    while (!source.isEnd()) {
      if (source.isInputCharacter('*')) {
        source.proceed();
        if (source.isInputCharacter('/')) {
          source.proceed();
          return new TraditionalCommentTail();
        } else {
          source.proceed();
        }
      } else {
        source.proceed();
      }
    }
    throw new ParseException(source, "TraditionalCommentTail expected");
  }
}
