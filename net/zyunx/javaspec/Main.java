package net.zyunx.javaspec;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;
import java.util.*;

public class Main extends Object implements Cloneable, Runnable {
  public static void main(String[] args) throws IOException {
    String javaFile = args[0];
    FileInputStream in = new FileInputStream(javaFile);
    Vector sourceChars = FirstStepScanner.scan(in);
    in.close();
    //EscapedInputCharacterScanner.print(sourceChars);

    SecondStepSource source2 = SecondStepScanner.scan(sourceChars);
    /*SecondStepScanner.print(sourceInput);*/
    /** asdfalsdf
     * lasjdf
     * alskd/
     * lasjd*/
    ThirdStepSource source3 = ThirdStepScanner.scan(source2);
    ThirdStepScanner.print(source3);
    int hex = 0xF00adf;
    long oct = 070621L;
    long dec = 1234l;
    double d1 = 123. + 123.456 + 123.E+234 + 123.d 
      + .456 + 789E1;
    float f1 = 1e1f + 2.f + .3f + 3.14f + 6.02e+23f;
    boolean trueVar = true || false;
    String s = "" + "abcd" + "'\"" + 'a' + '\\' + '\n' + '\123';

    System.out.println("Syntax step:");
    CompilationUnit unit = CompilationUnitParser.get().parse(source3);
    System.out.println(unit);
  }

  public void run() {
  }
}
