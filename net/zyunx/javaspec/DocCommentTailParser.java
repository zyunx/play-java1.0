package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class DocCommentTailParser {
  public static DocCommentTail parse(SecondStepSource source) {
    while (!source.isEnd()) {
      if (source.isInputCharacter('/')) {
        source.proceed();
        return new DocCommentTail();
      } else if (source.isInputCharacter('*')) {
        source.proceed();
      } else {
        source.proceed();
        TraditionalCommentTailParser.parse(source);
        return new DocCommentTail();
      }
    }
    throw new ParseException(source, "DocCommentTail expected");
  }
}
