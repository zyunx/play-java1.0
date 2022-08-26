package net.zyunx.javaspec;

import java.util.Vector;
import java.io.InputStream;
import java.io.IOException;

public class FirstStepScanner {
  public static Vector scan(InputStream in) throws IOException {
    Vector sourceBytes = ByteScanner.scan(in);
    Vector sourceChars = EscapedInputCharacterScanner.scan(sourceBytes);
    return sourceChars;
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
