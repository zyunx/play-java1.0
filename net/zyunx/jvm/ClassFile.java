package net.zyunx.jvm;

import java.io.*;

public class ClassFile {
  public static final String testStr = "TESTSTR";
  public static final int testInt = 100;

  private int magic = 1;
  int minorVersion;
  int majorVersion;
  int constantPoolCount;
  ConstantInfo constantPool[];
  int accessFlags;
  int thisClass;
  int superClass;
  int interfaceCount;
  int[] interfaces;
  int fieldsCount;
  FieldInfo fields[];
  int methodsCount;
  MethodInfo[] methods;
   
  public void read(InputStream in)
      throws IOException, ClassFileFormatException
  {
    DataInput di = new DataInputStream(in);
    magic = di.readInt();
    minorVersion = di.readUnsignedShort();
    majorVersion = di.readUnsignedShort();
    constantPoolCount = di.readUnsignedShort();
    constantPool = new ConstantInfo[constantPoolCount];
    constantPool[0] = null;
    for (int i = 1; i < constantPoolCount; i++)
    {
      constantPool[i] = ConstantInfoHelper.read(di, i, this);
    }
    accessFlags = di.readUnsignedShort();
    thisClass = di.readUnsignedShort();
    superClass = di.readUnsignedShort();
    interfaceCount = di.readUnsignedShort();
    interfaces = new int[interfaceCount];
    for (int i = 0; i < interfaceCount; i++) {
      interfaces[i] = di.readUnsignedShort();
    }
    fieldsCount = di.readUnsignedShort();
    fields = new FieldInfo[fieldsCount];
    for (int i = 0; i < fieldsCount; i++) {
      fields[i] = new FieldInfo(constantPool);
      fields[i].read(di, constantPool);
    }
    methodsCount = di.readUnsignedShort();
    methods = new MethodInfo[methodsCount];
    for (int i = 0; i < methodsCount; i++) {
      methods[i] = new MethodInfo(constantPool);
      methods[i].read(di, constantPool);
    }

  }

  public int getMethodsCount() {
    return methodsCount;
  }
  public MethodInfo[] getMethods() {
    return methods;
  }
  public String getMagicText() {
    return toHex(magic);
  }
  public int getMinorVersion() {
    return minorVersion;
  }
  public int getMajorVersion() {
    return majorVersion;
  }
  public int getConstantPoolCount() {
    return constantPoolCount;
  }
  public ConstantInfo[] getConstantPool()
  {
    return constantPool;
  }
  public int getAccessFlags() {
    return accessFlags;
  }
  public int getThisClass() {
    return thisClass;
  }
  public int getSuperClass() {
    return superClass;
  }
  public int getInterfaceCount() {
    return interfaceCount;
  }
  public int[] getInterfaces() {
    return interfaces;
  }
  public int getFieldsCount() {
    return fieldsCount;
  }
  public FieldInfo[] getFields() {
    return fields;
  }

  public static String toHex(int d)
  {
    StringBuffer sb = new StringBuffer();
    return sb.append("0x")
      .append(toHexDigit(d >>> 28))
      .append(toHexDigit((d >>> 24) & 0xF))
      .append(toHexDigit((d >>> 20) & 0xF))
      .append(toHexDigit((d >>> 16) & 0xF))
      .append(toHexDigit((d >>> 12) & 0xF))
      .append(toHexDigit((d >>> 8) & 0xF))
      .append(toHexDigit((d >>> 4) & 0xF))
      .append(toHexDigit(d & 0xF))
      .toString();
      
  }

  public static char toHexDigit(int d)
  {
    return Character.toUpperCase(Character.forDigit(d, 16));
  }
}
