package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class LineNumber {
  int startPc;
  int lineNumber;

  public int getStartPc() {
    return startPc;
  }
  public int getLineNumber() {
    return lineNumber;
  }
  public void read(DataInput di) throws IOException {
    startPc = di.readUnsignedShort();
    lineNumber = di.readUnsignedShort();
  }
}
