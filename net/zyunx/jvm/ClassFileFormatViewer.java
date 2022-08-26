package net.zyunx.jvm;

import java.io.*;

public class ClassFileFormatViewer
{
  public static void main(String args[])
      throws IOException, ClassFileFormatException
  {
    String classFilePath = args[0];
    InputStream classFileInputStream = new FileInputStream(classFilePath);
    ClassFile classFile = new ClassFile();
    classFile.read(classFileInputStream);
    classFileInputStream.close();    

    System.out.println("magic: " + classFile.getMagicText());
    System.out.println("minor version: " + classFile.getMinorVersion());
    System.out.println("major version: " + classFile.getMajorVersion());
    System.out.println("constant pool count: "
        + classFile.getConstantPoolCount());
    System.out.println("constant pool:");
    ConstantInfo[] constantPool = classFile.getConstantPool();
    for (int i = 0; i < constantPool.length; i++)
    {
      ConstantInfo ci = constantPool[i];
      if (null == ci) {
        System.out.println("  ConstantInfo: null");
      } else {
        System.out.print(ci.toString("  ")); 
      }
    }
    System.out.println("access flags: "
        + AccessFlags.toString(classFile.getAccessFlags()));
    System.out.println("this_class: "
        + constantPool[classFile.getThisClass()].toString(""));
    System.out.println("super_class: "
        + constantPool[classFile.getSuperClass()].toString(""));
    System.out.println("interface count: " + classFile.getInterfaceCount());
    System.out.println("intefaces:");
    for (int i = 0; i < classFile.getInterfaceCount(); i++) {
      System.out.println(constantPool[classFile.getInterfaces()[i]]
          .toString("    "));
    }
    System.out.println("field count: " + classFile.getFieldsCount());
    System.out.println("fields:");
    for (int i = 0; i < classFile.getFieldsCount(); i++) {
      System.out.println(classFile.getFields()[i].toString("    "));
    }
    System.out.println("methods count: " + classFile.getMethodsCount());
    System.out.println("methods:");
    for (int i = 0; i < classFile.getMethodsCount(); i++) {
      System.out.println(classFile.getMethods()[i].toString("    "));
    }
  }
}
