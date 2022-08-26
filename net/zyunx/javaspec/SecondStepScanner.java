package net.zyunx.javaspec;

import java.util.Vector;
import net.zyunx.common.Assert;
import net.zyunx.common.IllegalStateException;

public class SecondStepScanner {
  public static SecondStepSource scan(Vector escapedChars) {
    Vector v = new Vector();
    int size = escapedChars.size();
    int i = 0;
    while (i < size) {
      EscapedInputCharacter escaped =
        (EscapedInputCharacter) escapedChars.elementAt(i);
      char c = escaped.getChar();
      if (c == '\n') {
        v.addElement(new LineTerminator());
      } else if (c == '\r') {
        i++;
        EscapedInputCharacter next =
          (EscapedInputCharacter) escapedChars.elementAt(i);
        Assert.assertTrue(next.getChar() == '\n',
            "'\\r' don't fllows '\\n'");
        v.addElement(new LineTerminator());
      } else {
        v.addElement(new InputCharacter(escaped));
      }

      i++;
    }
    return new SecondStepSource(v);
  }

  public static void print(Vector input) {
    for (int i = 0; i < input.size(); i++) {
      Object t = input.elementAt(i);
      if (t instanceof InputCharacter) {
        System.out.print(((InputCharacter) t).getChar());
      } else if (t instanceof LineTerminator) {
        System.out.println("<LineTerminator>");
      } else {
        throw new IllegalStateException("Invalid input");
      }
    }
    System.out.println();
    System.out.println("total inputs: " + input.size());
  }
}
