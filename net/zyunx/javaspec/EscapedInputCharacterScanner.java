package net.zyunx.javaspec;

import java.util.Vector;

public class EscapedInputCharacterScanner {
  public static Vector scan(Vector sourceBytes) {
    Vector v = new Vector();
    for (int i = 0; i < sourceBytes.size(); i++) {
      v.addElement(new EscapedInputCharacter(
            ((Integer) sourceBytes.elementAt(i)).intValue()));
    } 
    return v;
  }

  public static void print(Vector escapedInputChars) {
    for (int i = 0; i < escapedInputChars.size(); i++) {
      System.out.print(
          ((EscapedInputCharacter) escapedInputChars.elementAt(i))
          .getChar());
    }
    System.out.println();
    System.out.println("total chars: " + escapedInputChars.size());
  }
}
