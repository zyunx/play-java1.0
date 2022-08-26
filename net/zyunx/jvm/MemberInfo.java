package net.zyunx.jvm;

import java.io.DataInput;
import java.io.IOException;

public class MemberInfo {
  int accessFlags;
  int nameIndex;
  int signatureIndex;
  int attributesCount;
  AttributeInfo attributes[];

  ConstantInfo[] constantPool;

  public MemberInfo(ConstantInfo[] cp) {
    constantPool = cp;
  }

  public void read(DataInput di, ConstantInfo[] cp)
      throws IOException {
    accessFlags = di.readUnsignedShort();
    nameIndex = di.readUnsignedShort();
    signatureIndex = di.readUnsignedShort();
    attributesCount = di.readUnsignedShort();
    attributes = new AttributeInfo[attributesCount];
    for (int i = 0; i < attributesCount; i++) {
      attributes[i] = AttributeInfoHelper.read(di, cp);
    }
  }

  public String getName() {
    ConstantInfoOfUtf8 name =
      (ConstantInfoOfUtf8) constantPool[nameIndex];
    return name.getText();
  }

  public String getSignature() {
    ConstantInfoOfUtf8 signature =
      (ConstantInfoOfUtf8) constantPool[signatureIndex];
    return signature.getText();
  }

  public String toString() {
    return toString("");
  }

  public String toString(String prefix)
  {
    String indent = "    ";
    StringBuffer sb = new StringBuffer()
        .append(prefix)
        .append("MemberInfo (Field or Method) {")
        .append(Platform.ln())
        .append(prefix).append(indent)
        .append("accessFlags: ").append(AccessFlags.toString(accessFlags))
        .append(Platform.ln())
        .append(prefix).append(indent)
        .append("name: ").append(nameIndex)
        .append("(").append(getName()).append(")")
        .append(Platform.ln())
        .append(prefix).append(indent)
        .append("signature: ").append(signatureIndex)
        .append("(").append(getSignature()).append(")")
        .append(Platform.ln())
        .append(prefix).append(indent)
        .append("attributes count: ").append(attributesCount)
        .append(Platform.ln())
        .append(prefix).append(indent)
        .append("attributes:")
        .append(Platform.ln());

    for (int i = 0; i < attributesCount; i++) {
      sb.append(attributes[i].toString(prefix + indent + indent));
    }

    return sb
        .append(prefix).append("}")
        .toString();
  }
}
