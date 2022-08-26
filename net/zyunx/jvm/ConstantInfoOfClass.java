package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfClass extends ConstantInfo
{
    private int nameIndex;

    private ClassFile classFile;

    public ConstantInfoOfClass(ClassFile classFile)
    {
        super(ConstantInfoHelper.CONSTANT_Class);
        this.classFile = classFile;
    }

    public int getNameIndex()
    {
        return nameIndex;
    }

    public String getName()
    {
        ConstantInfoOfUtf8 utf8Info = (ConstantInfoOfUtf8)
            classFile.getConstantPool()[nameIndex];
        return utf8Info.getText();
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        nameIndex = in.readUnsignedShort();
    }

    public String toString(String prefix)
    {
        String indent = "    ";
        return new StringBuffer()
            .append(prefix).append("CONSTANT_Class {")
            .append(Platform.ln())
            .append(prefix).append(indent)
            .append("name_index: ").append(nameIndex)
            .append(" (").append(getName()).append(")")
            .append(Platform.ln())
            .append(prefix).append("}")
            .append(Platform.ln())
            .toString();
    }
}
