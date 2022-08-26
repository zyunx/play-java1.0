package net.zyunx.jvm;

import java.io.*;

public abstract class ConstantInfoOfMemberref extends ConstantInfo
{
    private int classIndex;
    private int nameAndTypeIndex;
    protected ClassFile classFile;
    protected int poolIndex;

    public ConstantInfoOfMemberref(byte tag, ClassFile classFile, int poolIndex)
    {
        super(tag);
        this.classFile = classFile;    
        this.poolIndex = poolIndex;
    }

    public int getClassIndex()
    {
        return classIndex;
    }

    public String getClassName()
    {
        ConstantInfoOfClass classInfo = (ConstantInfoOfClass)
            classFile.getConstantPool()[classIndex];
        return classInfo.getName();
    }

    public int getNameAndTypeIndex()
    {
        return nameAndTypeIndex;
    }

    public String getNameAndType()
    {
        ConstantInfoOfNameAndType info = (ConstantInfoOfNameAndType)
            classFile.getConstantPool()[nameAndTypeIndex];
        return info.getName() + ":" + info.getSignature();
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        classIndex = in.readUnsignedShort();
        nameAndTypeIndex = in.readUnsignedShort();
    }
    public String toString(String prefix)
    {
        return new StringBuffer()
            .append(prefix)
            .append(poolIndex).append(":")
            .append("CONSTANT_Memberref: ")
            .append(getClassName())
            .append(".")
            .append(getNameAndType())
            .append(Platform.ln())
            .toString();
    }
}
