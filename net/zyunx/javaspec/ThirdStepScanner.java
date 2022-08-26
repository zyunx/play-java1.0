package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class ThirdStepScanner {
  public static ThirdStepSource scan(SecondStepSource source) {
    Vector input = new Vector();
    while (!source.isEnd()) {
      if (CommentParser.is(source)) {
        input.addElement(CommentParser.parse(source));
      } else if (WhiteSpaceParser.is(source)) {
        input.addElement(WhiteSpaceParser.parse(source));
      } else {
        Token t = TokenParser.parse(source);
        input.addElement(t);
      }
    }
    return new ThirdStepSource(input);
  }

  public static void print(ThirdStepSource source) {
    Vector inputElements = source.getInputElements();
    for (int i = 0; i < inputElements.size(); i++) {
      System.out.print(inputElements.elementAt(i));
    }
    System.out.println("Total input elements: " + inputElements.size());
  }
}
