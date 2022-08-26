package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfInterfaceMethodref
    extends ConstantInfoOfMemberref
{
    public ConstantInfoOfInterfaceMethodref(ClassFile classFile, int poolIndex)
    {
        super(ConstantInfoHelper.CONSTANT_InterfaceMethodref, classFile, poolIndex);
    }

    public String toString(String prefix)
    {
        return new StringBuffer()
            .append(prefix)
            .append(poolIndex).append(":")
            .append("CONSTANT_InterfaceMethodref: ")
            .append(getClassName())
            .append(".")
            .append(getNameAndType())
            .append(Platform.ln())
            .toString();
    }
}
