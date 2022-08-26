package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfSourceFile
    extends AttributeInfo {

  int sourceFileIndex;
  
  public AttributeInfoOfSourceFile(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    sourceFileIndex = di.readUnsignedShort();
  }

  public ConstantInfoOfUtf8 getSourceFile() {
    return (ConstantInfoOfUtf8) constantPool[sourceFileIndex];
  }

}
