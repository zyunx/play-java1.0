package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfCode
    extends AttributeInfo {

  int maxStack;
  int maxLocals;
  int codeLength;
  byte[] code;
  int exceptionTableLength;
  ExceptionInAttributeInfoOfCode[] exceptionTable;
  int attributesCount;
  AttributeInfo[] attributes; 

  public AttributeInfoOfCode(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    maxStack = di.readUnsignedShort();
    maxLocals = di.readUnsignedShort();
    codeLength = di.readInt();
    code = new byte[codeLength];
    di.readFully(code);
    exceptionTableLength = di.readUnsignedShort();
    exceptionTable =
      new ExceptionInAttributeInfoOfCode[exceptionTableLength];
    for (int i = 0; i < exceptionTableLength; i++) {
      exceptionTable[i].read(di);
    }
    attributesCount = di.readUnsignedShort();
    attributes = new AttributeInfo[attributesCount];
    for (int i = 0; i < attributesCount; i++) {
      attributes[i] = AttributeInfoHelper.read(di, constantPool);
    }

  }

  public String toString(String prefix) {
    String indent = prefix + "    ";
    StringBuffer sb = new StringBuffer();
    sb.append(prefix)
      .append("Code_attribute {")
      .append(Platform.ln())
      .append(indent)
      .append("maxStack: ").append(maxStack)
      .append(Platform.ln())
      .append(indent)
      .append("max_locals: ").append(maxLocals)
      .append(Platform.ln())
      .append(indent)
      .append("codeLength: ").append(codeLength)
      .append(Platform.ln())
      .append(indent)
      .append("exceptionTableLength: ")
      .append(exceptionTableLength)
      .append(Platform.ln())
      .append(indent).append("exceptionTable:")
      .append(Platform.ln());

    for (int i = 0; i < exceptionTableLength; i++) {
      ExceptionInAttributeInfoOfCode ex = exceptionTable[i];
      ConstantInfoOfClass catchType =
        (ConstantInfoOfClass) constantPool[ex.getCatchType()];
      String l2indent = indent + "    ";
      String l3indent = l2indent + "    ";
      sb.append(l2indent).append("{")
        .append(l3indent).append("startPc: ")
        .append(ex.getStartPc()).append(Platform.ln())
        .append(l3indent).append("endPc: ")
        .append(ex.getEndPc()).append(Platform.ln())
        .append(l3indent).append("handlerPc: ")
        .append(ex.getHandlerPc()).append(Platform.ln())
        .append(l3indent).append("catchType: ")
        .append(catchType.toString(l3indent)).append(Platform.ln())
        .append(l2indent).append("}").append(Platform.ln());
    }


    sb.append(indent).append("attributesCount: ")
      .append(attributesCount).append(Platform.ln())
      .append(indent).append("attributes: ").append(Platform.ln());
    for (int i = 0; i < attributesCount; i++) {
      AttributeInfo attr = attributes[i];
      String l2indent = indent + "    ";
      sb.append(attr.toString(l2indent)).append(Platform.ln());
    }
    sb.append(prefix)
      .append("}")
      .append(Platform.ln());

    return sb.toString(); 
  }
}
