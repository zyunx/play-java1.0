package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfFloat extends ConstantInfo
{
    private int bytes;

    public ConstantInfoOfFloat()
    {
        super(ConstantInfoHelper.CONSTANT_Float);
    }

    public int getBytes()
    {
        return bytes;
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        bytes = in.readInt();
    }
}
