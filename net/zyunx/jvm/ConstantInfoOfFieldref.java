package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfFieldref extends ConstantInfoOfMemberref
{
    public ConstantInfoOfFieldref(ClassFile classFile, int poolIndex)
    {
        super(ConstantInfoHelper.CONSTANT_Fieldref, classFile, poolIndex);
    }

    public String toString(String prefix)
    {
        return new StringBuffer()
            .append(prefix)
            .append(poolIndex).append(":")
            .append("CONSTANT_Fieldref: ")
            .append(getClassName())
            .append(".")
            .append(getNameAndType())
            .append(Platform.ln())
            .toString();
    }
}
