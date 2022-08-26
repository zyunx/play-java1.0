package net.zyunx.jvm;

import java.io.*;

public abstract class ConstantInfo
{
    public static final byte CONSTANT_Class = 7;
    public static final byte CONSTANT_Fieldref = 9;
    public static final byte CONSTANT_Methodref = 10;
    public static final byte CONSTANT_InterfaceMethodref = 11;
    public static final byte CONSTANT_String = 8;
    public static final byte CONSTANT_Integer = 3;
    public static final byte CONSTANT_Float = 4;
    public static final byte CONSTANT_Long = 5;
    public static final byte CONSTANT_Double = 6;
    public static final byte CONSTANT_NameAndType = 12;
    public static final byte CONSTANT_Utf8 = 1;
    public static final byte CONSTANT_Unicode = 2;

    protected byte tag;

    public ConstantInfo(byte tag)
    {
        this.tag = tag;
    }

    public byte getTag()
    {
        return tag;
    }

    public String toString(String prefix)
    {
        String indent = "    ";
        return new StringBuffer()
            .append(prefix).append("ConstantInfo {")
            .append(Platform.ln())
            .append(prefix).append(indent).append("tag: ").append(tag)
            .append(Platform.ln())
            .append(prefix).append("}")
            .append(Platform.ln())
            .toString();
    }

    public abstract void readMoreThanTag(DataInput in) throws IOException;
}
