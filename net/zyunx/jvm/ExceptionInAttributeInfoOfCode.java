package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class ExceptionInAttributeInfoOfCode {
  int startPc;
  int endPc;
  int handlerPc;
  int catchType;

  public int getStartPc() {
    return startPc;
  }
  public int getEndPc() {
    return endPc;
  }
  public int getHandlerPc() {
    return handlerPc;
  }
  public int getCatchType() {
    return catchType;
  }

  public void read(DataInput di) throws IOException {
    startPc = di.readUnsignedShort();
    endPc = di.readUnsignedShort();
    handlerPc = di.readUnsignedShort();
    catchType = di.readUnsignedShort();
  }
}
