package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoHelper {
  public static AttributeInfo read(DataInput di,
      ConstantInfo[] constantPool) throws IOException  {
    int attributeNameIndex = di.readUnsignedShort();
    int attributeLength = di.readInt();
    ConstantInfoOfUtf8 name =
      (ConstantInfoOfUtf8) constantPool[attributeNameIndex];
    String nameText = name.getText();

    AttributeInfo attr = null;
    if ("ConstantValue".equals(nameText)) {
      attr = new AttributeInfoOfConstantValue(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else if ("Code".equals(nameText)) {
      attr = new AttributeInfoOfCode(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else if ("Exceptions".equals(nameText)) {
      attr = new AttributeInfoOfExceptions(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else if ("SourceFile".equals(nameText)) {
      attr = new AttributeInfoOfSourceFile(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else if ("LineNumberTable".equals(nameText)) {
      attr = new AttributeInfoOfLineNumberTable(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else if ("LocalVariableTable".equals(nameText)) {
      attr = new AttributeInfoOfLocalVariableTable(
          attributeNameIndex,
          attributeLength,
          constantPool);
    } else {
      throw new RuntimeException(
          "invalid atrribute name: " + nameText);
    }
    attr.readInfo(di);
    return attr;
  }
}
