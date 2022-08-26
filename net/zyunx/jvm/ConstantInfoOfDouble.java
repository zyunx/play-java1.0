package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfDouble extends ConstantInfo
{
    private int highBytes;
    private int lowBytes;

    public ConstantInfoOfDouble()
    {
        super(ConstantInfoHelper.CONSTANT_Double);
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
