package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfInteger extends ConstantInfo
{
    private int bytes;

    public ConstantInfoOfInteger()
    {
        super(ConstantInfoHelper.CONSTANT_Integer);
    }

    public int getBytes()
    {
        return bytes;
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        bytes = in.readInt();
    }

    public String toString(String prefix) {
      return new StringBuffer()
        .append(prefix)
        .append("Constant_Integer: ").append(bytes)
        .append(Platform.ln())
        .toString();
    }
}
