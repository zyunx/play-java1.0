package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfUnicode extends ConstantInfo
{
    short length;
    byte bytes[];

    public ConstantInfoOfUnicode()
    {
        super(ConstantInfoHelper.CONSTANT_Unicode);
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
}
