package net.zyunx.javaspec;

import java.io.InputStream;
import java.io.IOException;
import java.util.Vector;

public class ByteScanner {
  public static void print(Vector bytes) {
    for (int i = 0; i < bytes.size(); i++) {
      System.out.print(bytes.elementAt(i));
      System.out.print(" ");
    }
    System.out.println();
    System.out.println("total bytes: " + bytes.size());
  }

  public static Vector scan(InputStream in) throws IOException {
    Vector bs = new Vector(1024, 512);
    int b = -1;
    while (-1 != (b = in.read())) {
      bs.addElement(new Integer(b));
    }
    return bs;
  }
}
