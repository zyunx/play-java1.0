package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfMethodref extends ConstantInfoOfMemberref
{
    public ConstantInfoOfMethodref(ClassFile classFile, int poolIndex)
    {
        super(ConstantInfoHelper.CONSTANT_Methodref, classFile, poolIndex);
    }

    public String toString(String prefix)
    {
        return new StringBuffer()
            .append(prefix)
            .append(poolIndex).append(":")
            .append("CONSTANT_Methodref: ")
            .append(getClassName())
            .append(".")
            .append(getNameAndType())
            .append(Platform.ln())
            .toString();
    }
}
