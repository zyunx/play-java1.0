package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class LocalVariable {
  int startPc;
  int length;
  int nameIndex;
  int signatureIndex;
  int slot;

  public int getStartPc() {
    return startPc;
  }

  public int getLength() {
    return length;
  }

  public int getNameIndex() {
    return nameIndex;
  }
  public int getSignatureIndex() {
    return signatureIndex;
  }
  public int getSlot() {
    return slot;
  }

  public void read(DataInput di) throws IOException {
    startPc = di.readUnsignedShort();
    length = di.readUnsignedShort();
    nameIndex = di.readUnsignedShort();
    signatureIndex = di.readUnsignedShort();
    slot = di.readUnsignedShort();
  }
}
