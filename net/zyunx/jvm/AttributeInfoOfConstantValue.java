package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfConstantValue
    extends AttributeInfo {

  int constantValueIndex;
  
  public AttributeInfoOfConstantValue(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    constantValueIndex = di.readUnsignedShort();
  }

  public ConstantInfo getConstantInfo() {
    return constantPool[constantValueIndex];
  }

  public String toString(String prefix) {
    return getConstantInfo().toString(prefix);
  }
}
