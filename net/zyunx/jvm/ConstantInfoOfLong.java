package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfLong extends ConstantInfo
{
    private int highBytes;
    private int lowBytes;

    public ConstantInfoOfLong()
    {
        super(ConstantInfoHelper.CONSTANT_Long);
    }

    public int getHighBytes()
    {
        return highBytes;
    }
    public int getLowBytes()
    {
        return lowBytes;
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        highBytes = in.readInt();
        lowBytes = in.readInt();
    }
}
