package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfUtf8 extends ConstantInfo
{
    short length;
    byte bytes[];

    private int index;

    public ConstantInfoOfUtf8(int index)
    {
        super(ConstantInfoHelper.CONSTANT_Utf8);
        this.index = index;
    }

    public short getLength()
    {
        return length;
    }

    public byte[] getBytes()
    {
        return bytes;
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        length = in.readShort();
        bytes = new byte[length];
        in.readFully(bytes);
    }

    public String getText()
    {
        return new String(bytes, 0);
    }

    public String toString(String prefix)
    {
        return new StringBuffer()
            .append(prefix).append(index).append(":")
            .append("CONSTANT_Utf8: ").append(getText())
            .append(Platform.ln())
            .toString();
    }
}
