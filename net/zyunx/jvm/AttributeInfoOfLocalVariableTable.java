package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfLocalVariableTable
    extends AttributeInfo {
  int localVariableTableLength;
  LocalVariable localVariableTable[];
  
  public AttributeInfoOfLocalVariableTable(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    localVariableTableLength = di.readUnsignedShort();
    localVariableTable = new LocalVariable[localVariableTableLength];
    for (int i = 0; i < localVariableTableLength; i++) {
      LocalVariable lv = new LocalVariable();
      lv.read(di);
      localVariableTable[i] = lv;
    }
  }
}
