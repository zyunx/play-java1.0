package net.zyunx.jvm;

public class AccessFlags
{
  public static final int ACC_PUBLIC = 0x0001;
  public static final int ACC_PRIVATE = 0x0002;
  public static final int ACC_PROTECTED = 0x0004;
  public static final int ACC_STATIC = 0x0008;
  public static final int ACC_FINAL = 0x0010;
  public static final int ACC_SYNCHRONIZED = 0x0020;
  public static final int ACC_VOLATILE = 0x0040;
  public static final int ACC_TRANSIENT = 0x0080; 
  public static final int ACC_NATIVE = 0x0100;
  public static final int ACC_INTERFACE = 0x0200; 
  public static final int ACC_ABSTRACT = 0x0400; 

  public static boolean isPublic(int f)
  {
    return (f & ACC_PUBLIC) > 0;
  }
  public static boolean isPrivate(int f)
  {
    return (f & ACC_PRIVATE) > 0;
  }
  public static boolean isProtected(int f)
  {
    return (f & ACC_PROTECTED) > 0;
  }
  public static boolean isStatic(int f)
  {
    return (f & ACC_STATIC) > 0;
  }
  public static boolean isFinal(int f)
  {
    return (f & ACC_FINAL) > 0;
  }
  public static boolean isSynchronized(int f)
  {
    return (f & ACC_SYNCHRONIZED) > 0;
  }
  public static boolean isVolatile(int f)
  {
    return (f & ACC_VOLATILE) > 0;
  }
  public static boolean isTransient(int f)
  {
    return (f & ACC_TRANSIENT) > 0;
  }
  public static boolean isNative(int f)
  {
    return (f & ACC_NATIVE) > 0;
  }
  public static boolean isInterface(int f)
  {
    return (f & ACC_INTERFACE) > 0;
  }
  public static boolean isAbstract(int f)
  {
    return (f & ACC_ABSTRACT) > 0;
  }

  public static String toString(int f)
  {
    StringBuffer sb = new StringBuffer();
    if (isPublic(f)) {
      sb.append("ACC_PUBLIC").append("|");
    }
    if (isPrivate(f)) {
      sb.append("ACC_PRIVATE").append("|");
    }
    if (isProtected(f)) {
      sb.append("ACC_PROTECTED").append("|");
    }
    if (isStatic(f)) {
      sb.append("ACC_STATIC").append("|");
    }
    if (isFinal(f)) {
      sb.append("ACC_FINAL").append("|");
    }
    if (isSynchronized(f)) {
      sb.append("ACC_SYNCHRONIZED").append("|");
    }
    if (isVolatile(f)) {
      sb.append("ACC_VOLATILE").append("|");
    }
    if (isTransient(f)) {
      sb.append("ACC_TRANSIENT").append("|");
    }
    if (isNative(f)) {
      sb.append("ACC_NATIVE").append("|");
    }
    if (isInterface(f)) {
      sb.append("ACC_INTERFACE").append("|");
    }
    if (isAbstract(f)) {
      sb.append("ACC_ABSTRACT").append("|");
    }
    if (sb.length() > 1) {
      sb.setLength(sb.length() - 1);
    }
    return sb.toString();
  }
}
