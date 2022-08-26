package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public abstract class AttributeInfo {
  protected int attributeNameIndex;
  protected int attributeLength;
  protected ConstantInfo[] constantPool;

  public AttributeInfo(int attributeNameIndex,
      int attributeLength, ConstantInfo[] cp) {
    constantPool = cp;
    this.attributeNameIndex = attributeNameIndex;
    this.attributeLength = attributeLength;
  }

  public int getAtrributeNameIndex() {
    return attributeNameIndex;
  }

  public String getAttributeName() {
    ConstantInfoOfUtf8 utf8 =
      (ConstantInfoOfUtf8) constantPool[attributeNameIndex];
    return utf8.getText();
  }

  public int attributeLength() {
    return attributeLength;
  }

  public abstract void readInfo(DataInput di) throws IOException;

  public String toString() {
    return toString("");
  }
  public String toString(String prefix) {
    return new StringBuffer()
      .append(prefix)
      .append(getAttributeName())
      .append("_attribute")
      .toString();
  }
}
