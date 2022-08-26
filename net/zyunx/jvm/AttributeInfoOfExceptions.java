package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfExceptions
    extends AttributeInfo {

  int numberOfExceptions;
  int exceptionIndexTable[];
  
  public AttributeInfoOfExceptions(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    numberOfExceptions = di.readUnsignedShort();
    exceptionIndexTable = new int[numberOfExceptions];
    for (int i = 0; i < numberOfExceptions; i++) {
      exceptionIndexTable[i] = di.readUnsignedShort();
    }
  }

  public int getNumberOfExceptions() {
    return numberOfExceptions;
  }

  public String toString(String prefix) {
    String indent = prefix + "    ";
    StringBuffer sb = new StringBuffer();
    sb.append(prefix)
      .append("Exceptions_attribute {")
      .append(Platform.ln())
      .append(indent).append("numberOfExceptions: ")
      .append(getNumberOfExceptions()).append(Platform.ln());
    for (int i = 0; i < numberOfExceptions; i++) {
      sb.append(indent)
        .append(((ConstantInfoOfClass)constantPool[exceptionIndexTable[i]])
            .getName())
        .append(Platform.ln());
    }

    sb.append(prefix).append("}")
      .append(Platform.ln());

    return sb.toString();
  }
}
