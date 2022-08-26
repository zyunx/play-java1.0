package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class AttributeInfoOfLineNumberTable
    extends AttributeInfo {
  int lineNumberTableLength;
  LineNumber lineNumberTable[];
  
  public AttributeInfoOfLineNumberTable(int attributeNameIndex,
      int attributeLength, ConstantInfo[] constantPool) {
    super(attributeNameIndex, attributeLength, constantPool);
  }

  public void readInfo(DataInput di) throws IOException {
    lineNumberTableLength = di.readUnsignedShort();
    lineNumberTable = new LineNumber[lineNumberTableLength];
    for (int i = 0; i < lineNumberTableLength; i++) {
      LineNumber ln = new LineNumber();
      ln.read(di);
      lineNumberTable[i] = ln;
    }
  }

  public String toString(String prefix) {
    String indent = prefix + "    ";
    StringBuffer sb = new StringBuffer();
    sb.append(prefix).append("LineNumberTable_attribute {")
      .append(Platform.ln())
      .append(indent).append("lineNumberTableLength: ")
      .append(lineNumberTableLength).append(Platform.ln())
      .append(indent).append("lineNumberTable: ")
      .append(Platform.ln());
    for (int i = 0; i < lineNumberTableLength; i++) {
      LineNumber li = lineNumberTable[i];
      String l2indent = indent + "    ";
      String l3indent = l2indent + "    ";
      sb.append(l2indent)
        .append("startPc: ")
        .append(li.getStartPc())
        .append(", ")
        .append("lineNumber: ")
        .append(li.getLineNumber()).append(Platform.ln());
    }
    sb.append(prefix).append("}").append(Platform.ln());
    return sb.toString();
  }
}
