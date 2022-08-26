package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfString extends ConstantInfo
{
    private short stringIndex;

    private ClassFile classFile;

    public ConstantInfoOfString(ClassFile classFile)
    {
        super(ConstantInfoHelper.CONSTANT_String);
        this.classFile = classFile;
    }

    public short getStringIndex()
    {
        return stringIndex;
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        stringIndex = in.readShort();
    }

    public String toString(String prefix)
    {
        ConstantInfoOfUtf8 utf8Info = (ConstantInfoOfUtf8)
            classFile.getConstantPool()[stringIndex];
        String indent = "    ";
        return new StringBuffer()
            .append(prefix).append("CONSTANT_String {")
            .append(Platform.ln())
            .append(prefix).append(indent).append("string_index: ")
            .append(stringIndex)
            .append(" (").append(utf8Info.getText()).append(")")
            .append(Platform.ln())
            .append(prefix).append("}")
            .append(Platform.ln())
            .toString();
    }
}
