package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoOfNameAndType extends ConstantInfo
{
    private int nameIndex;
    private int signatureIndex;

    private ClassFile classFile;

    public ConstantInfoOfNameAndType(ClassFile classFile)
    {
        super(ConstantInfoHelper.CONSTANT_NameAndType);
        this.classFile = classFile;
    }

    public int getNameIndex()
    {
        return nameIndex;
    }

    public String getName()
    {
        ConstantInfoOfUtf8 utf8 = (ConstantInfoOfUtf8)
            classFile.getConstantPool()[nameIndex];
        return utf8.getText();
    }

    public int getSignatureIndex()
    {
        return signatureIndex;
    }

    public String getSignature()
    {
        ConstantInfoOfUtf8 utf8 = (ConstantInfoOfUtf8)
            classFile.getConstantPool()[signatureIndex];
        return utf8.getText();
    }

    public void readMoreThanTag(DataInput in) throws IOException
    {
        nameIndex = in.readUnsignedShort();
        signatureIndex = in.readUnsignedShort();
    }

    public String toString(String prefix)
    {
        String indent = "    ";
        return new StringBuffer()
            .append(prefix).append("CONSTANT_NameAndType {")
            .append(Platform.ln())
            .append(prefix).append(indent)
            .append("name_index: ").append(nameIndex)
            .append(" (").append(getName()).append(")")
            .append(Platform.ln())
            .append(prefix).append(indent)
            .append("signature_index: ").append(signatureIndex)
            .append(" (").append(getSignature()).append(")")
            .append(Platform.ln())
            .append(prefix).append("}")
            .append(Platform.ln())
            .toString();
            
    }
}
