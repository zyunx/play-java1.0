package net.zyunx.jvm;

import java.io.*;

public class ConstantInfoHelper
{
    public static final byte CONSTANT_Class = 7;
    public static final byte CONSTANT_Fieldref = 9;
    public static final byte CONSTANT_Methodref = 10;
    public static final byte CONSTANT_InterfaceMethodref = 11;
    public static final byte CONSTANT_String = 8;
    public static final byte CONSTANT_Integer = 3;
    public static final byte CONSTANT_Float = 4;
    public static final byte CONSTANT_Long = 5;
    public static final byte CONSTANT_Double = 6;
    public static final byte CONSTANT_NameAndType = 12;
    public static final byte CONSTANT_Utf8 = 1;
    public static final byte CONSTANT_Unicode = 2;

    public static ConstantInfo read(DataInput in, int constantPoolIndex, ClassFile classFile)
            throws IOException, ClassFileFormatException
    {
        ConstantInfo constantInfo;
        byte tag = in.readByte();
        switch (tag)
        {
            case CONSTANT_Class:
                constantInfo = new ConstantInfoOfClass(classFile);
                break;
            case CONSTANT_Fieldref:
                constantInfo = new ConstantInfoOfFieldref(classFile,
                        constantPoolIndex);
                break;
            case CONSTANT_Methodref:
                constantInfo = new ConstantInfoOfMethodref(classFile,
                        constantPoolIndex);
                break;
            case CONSTANT_InterfaceMethodref:
                constantInfo = new ConstantInfoOfInterfaceMethodref(
                        classFile, constantPoolIndex);
                break;
            case CONSTANT_String:
                constantInfo = new ConstantInfoOfString(classFile);
                break;
            case CONSTANT_Integer:
                constantInfo = new ConstantInfoOfInteger();
                break;
            case CONSTANT_Float:
                constantInfo = new ConstantInfoOfFloat();
                break;
            case CONSTANT_Long:
                constantInfo = new ConstantInfoOfLong();
                break;
            case CONSTANT_Double:
                constantInfo = new ConstantInfoOfDouble();
                break;
            case CONSTANT_NameAndType:
                constantInfo = new ConstantInfoOfNameAndType(classFile);
                break;
            case CONSTANT_Utf8:
                constantInfo = new ConstantInfoOfUtf8(constantPoolIndex);
                break;
            case CONSTANT_Unicode:
                constantInfo = new ConstantInfoOfUnicode();
                break;
            default:
                throw new ClassFileFormatException("Wrong constant info tag: " + tag);
        }

        constantInfo.readMoreThanTag(in);
        return constantInfo;
    }
}
