package net.zyunx.jvm;

public class InstructionFormat {
  int opcodeNumber;
  String opcodeName;
  int operandBytesCount;

  public InstructionFormat(int opcodeNumber, 
      String opcodeName, int operandBytesCount) {
  }

  public static final InstructionFormat NOP = new InstructionFormat(
      0, "nop", 0);
  // load from constant
  public static final InstructionFormat ACONST_NULL = new InstructionFormat(
      1, "aconst_null", 0);
  public static final InstructionFormat ICONST_M1 = new InstructionFormat(
      2, "iconst_m1", 0); 
  public static final InstructionFormat ICONST_0 = new InstructionFormat(
      3, "iconst_0", 0);
  public static final InstructionFormat ICONST_1 = new InstructionFormat(
      4, "iconst_1", 0);
  public static final InstructionFormat ICONST_2 = new InstructionFormat(
      5, "iconst_2", 0);
  public static final InstructionFormat ICONST_3 = new InstructionFormat(
      6, "iconst_3", 0);
  public static final InstructionFormat ICONST_4 = new InstructionFormat(
      7, "iconst_4", 0);
  public static final InstructionFormat ICONST_5 = new InstructionFormat(
      8, "iconst_5", 0);
  public static final InstructionFormat LCONST_0 = new InstructionFormat(
      9, "lconst_0", 0);
  public static final InstructionFormat LCONST_1 = new InstructionFormat(
      10, "lconst_1", 0);
  public static final InstructionFormat FCONST_0 = new InstructionFormat(
      11, "fconst_0", 0);
  public static final InstructionFormat FCONST_1 = new InstructionFormat(
      12, "fconst_1", 0);
  public static final InstructionFormat FCONST_2 = new InstructionFormat(
      13, "fconst_2", 0);
  public static final InstructionFormat DCONST_0 = new InstructionFormat(
      14, "dconst_0", 0);
  public static final InstructionFormat DCONST_1 = new InstructionFormat(
      15, "dconst_1", 0);
  public static final InstructionFormat BIPUSH = new InstructionFormat(
      16, "bipush", 1);
  public static final InstructionFormat SIPUSH = new InstructionFormat(
      17, "sipush", 2);
  public static final InstructionFormat LDC1 = new InstructionFormat(
      18, "ldc1", 1);
  public static final InstructionFormat LDC2 = new InstructionFormat(
      19, "ldc2", 2);
  public static final InstructionFormat LDC2W = new InstructionFormat(
      20, "ldc2w", 2);
  // load from local variable
  public static final InstructionFormat ILOAD = new InstructionFormat(
      21, "iload", 1);
  public static final InstructionFormat LLOAD = new InstructionFormat(
      22, "lload", 1);
  public static final InstructionFormat FLOAD = new InstructionFormat(
      23, "fload", 1);
  public static final InstructionFormat DLOAD = new InstructionFormat(
      24, "dload", 1);
  public static final InstructionFormat ALOAD = new InstructionFormat(
      25, "aload", 1);
  public static final InstructionFormat ILOAD_0 = new InstructionFormat(
      26, "iload_0", 0);
  public static final InstructionFormat ILOAD_1 = new InstructionFormat(
      27, "iload_1", 0);
  public static final InstructionFormat ILOAD_2 = new InstructionFormat(
      28, "iload_2", 0);
  public static final InstructionFormat ILOAD_3 = new InstructionFormat(
      29, "iload_3", 0);
  public static final InstructionFormat LLOAD_0 = new InstructionFormat(
      30, "lload_0", 0);
  public static final InstructionFormat LLOAD_1 = new InstructionFormat(
      31, "lload_1", 0);
  public static final InstructionFormat LLOAD_2 = new InstructionFormat(
      32, "lload_2", 0);
  public static final InstructionFormat LLOAD_3 = new InstructionFormat(
      33, "lload_3", 0);
  public static final InstructionFormat FLOAD_0 = new InstructionFormat(
      34, "fload_0", 0);
  public static final InstructionFormat FLOAD_1 = new InstructionFormat(
      35, "fload_1", 0);
  public static final InstructionFormat FLOAD_2 = new InstructionFormat(
      36, "fload_2", 0);
  public static final InstructionFormat FLOAD_3 = new InstructionFormat(
      37, "fload_3", 0);
  public static final InstructionFormat DLOAD_0 = new InstructionFormat(
      38, "dload_0", 0);
  public static final InstructionFormat DLOAD_1 = new InstructionFormat(
      39, "dload_1", 0);
  public static final InstructionFormat DLOAD_2 = new InstructionFormat(
      40, "dload_2", 0);
  public static final InstructionFormat DLOAD_3 = new InstructionFormat(
      41, "dload_3", 0);
  public static final InstructionFormat ALOAD_0 = new InstructionFormat(
      42, "aload_0", 0);
  public static final InstructionFormat ALOAD_1 = new InstructionFormat(
      43, "aload_1", 0);
  public static final InstructionFormat ALOAD_2 = new InstructionFormat(
      44, "aload_2", 0);
  public static final InstructionFormat ALOAD_3 = new InstructionFormat(
      45, "aload_3", 0);
  // load from array
  public static final InstructionFormat IALOAD = new InstructionFormat(
      46, "iaload", 0);
  public static final InstructionFormat LALOAD = new InstructionFormat(
      47, "laload", 0);
  public static final InstructionFormat FALOAD = new InstructionFormat(
      48, "faload", 0);
  public static final InstructionFormat DALOAD = new InstructionFormat(
      49, "daload", 0);
  public static final InstructionFormat AALOAD = new InstructionFormat(
      50, "aaload", 0);
  public static final InstructionFormat BALOAD = new InstructionFormat(
      51, "baload", 0);
  public static final InstructionFormat CALOAD = new InstructionFormat(
      52, "caload", 0);
  public static final InstructionFormat SALOAD = new InstructionFormat(
      53, "saload", 0);
  // store to local varaibles 
  public static final InstructionFormat ISTORE = new InstructionFormat(
      54, "istore", 1);
  public static final InstructionFormat LSTORE = new InstructionFormat(
      55, "lstore", 1);
  public static final InstructionFormat FSTORE = new InstructionFormat(
      56, "fstore", 1);
  public static final InstructionFormat DSTORE = new InstructionFormat(
      57, "dstore", 1);
  public static final InstructionFormat ASTORE = new InstructionFormat(
      58, "astore", 1);
  public static final InstructionFormat ISTORE_0 = new InstructionFormat(
      59, "istore_0", 0);
  public static final InstructionFormat ISTORE_1 = new InstructionFormat(
      60, "istore_1", 0);
  public static final InstructionFormat ISTORE_2 = new InstructionFormat(
      61, "istore_2", 0);
  public static final InstructionFormat ISTORE_3 = new InstructionFormat(
      62, "istore_3", 0);
  public static final InstructionFormat LSTORE_0 = new InstructionFormat(
      63, "lstore_0", 0);
  public static final InstructionFormat LSTORE_1 = new InstructionFormat(
      64, "lstore_1", 0);
  public static final InstructionFormat LSTORE_2 = new InstructionFormat(
      65, "lstore_2", 0);
  public static final InstructionFormat LSTORE_3 = new InstructionFormat(
      66, "lstore_3", 0);
  public static final InstructionFormat FSTORE_0 = new InstructionFormat(
      67, "fstore_0", 0);
  public static final InstructionFormat FSTORE_1 = new InstructionFormat(
      68, "fstore_1", 0);
  public static final InstructionFormat FSTORE_2 = new InstructionFormat(
      69, "fstore_2", 0);
  public static final InstructionFormat FSTORE_3 = new InstructionFormat(
      70, "fstore_3", 0);
  public static final InstructionFormat DSTORE_0 = new InstructionFormat(
      71, "dstore_0", 0);
  public static final InstructionFormat DSTORE_1 = new InstructionFormat(
      72, "dstore_1", 0);
  public static final InstructionFormat DSTORE_2 = new InstructionFormat(
      73, "dstore_2", 0);
  public static final InstructionFormat DSTORE_3 = new InstructionFormat(
      74, "dstore_3", 0);
  public static final InstructionFormat ASTORE_0 = new InstructionFormat(
      75, "astore_0", 0);
  public static final InstructionFormat ASTORE_1 = new InstructionFormat(
      76, "astore_1", 0);
  public static final InstructionFormat ASTORE_2 = new InstructionFormat(
      77, "astore_2", 0);
  public static final InstructionFormat ASTORE_3 = new InstructionFormat(
      78, "astore_3", 0);
  // store to array
  public static final InstructionFormat IASTORE = new InstructionFormat(
      79, "iastore", 0);
  public static final InstructionFormat LASTORE = new InstructionFormat(
      80, "lastore", 0);
  public static final InstructionFormat FASTORE = new InstructionFormat(
      81, "fastore", 0);
  public static final InstructionFormat DASTORE = new InstructionFormat(
      82, "dastore", 0);
  public static final InstructionFormat AASTORE = new InstructionFormat(
      83, "aastore", 0);
  public static final InstructionFormat BASTORE = new InstructionFormat(
      84, "bastore", 0);
  public static final InstructionFormat CASTORE = new InstructionFormat(
      85, "castore", 0);
  public static final InstructionFormat SASTORE = new InstructionFormat(
      86, "sastore", 0);

  // stack operation
  public static final InstructionFormat POP = new InstructionFormat(
      87, "pop", 0);
  public static final InstructionFormat POP2 = new InstructionFormat(
      88, "pop2", 0);
  public static final InstructionFormat DUP = new InstructionFormat(
      89, "dup", 0);
  public static final InstructionFormat DUP_X1 = new InstructionFormat(
      90, "dup_x1", 0);
  public static final InstructionFormat DUP_X2 = new InstructionFormat(
      91, "dup_x2", 0);
  public static final InstructionFormat DUP2 = new InstructionFormat(
      92, "dup2", 0);
  public static final InstructionFormat DUP2_X1 = new InstructionFormat(
      93, "dup2_x1", 0);
  public static final InstructionFormat DUP2_X2 = new InstructionFormat(
      94, "dup2_x2", 0);
  public static final InstructionFormat SWAP = new InstructionFormat(
      95, "swap", 0);

  public static final InstructionFormat IADD = new InstructionFormat(
      96, "iadd", 0);
  public static final InstructionFormat LADD = new InstructionFormat(
      97, "ladd", 0);
  public static final InstructionFormat FADD = new InstructionFormat(
      98, "fadd", 0);
  public static final InstructionFormat DADD = new InstructionFormat(
      99, "dadd", 0);
  public static final InstructionFormat ISUB = new InstructionFormat(
      100, "isub", 0);
  public static final InstructionFormat LSUB = new InstructionFormat(
      101, "lsub", 0);
  public static final InstructionFormat FSUB = new InstructionFormat(
      102, "fsub", 0);
  public static final InstructionFormat DSUB = new InstructionFormat(
      103, "dsub", 0);
  public static final InstructionFormat IMUL = new InstructionFormat(
      104, "imul", 0);
  public static final InstructionFormat LMUL = new InstructionFormat(
      105, "lmul", 0);
  public static final InstructionFormat FMUL = new InstructionFormat(
      106, "fmul", 0);
  public static final InstructionFormat DMUL = new InstructionFormat(
      107, "dmul", 0);
  public static final InstructionFormat IDIV = new InstructionFormat(
      108, "idiv", 0);
  public static final InstructionFormat LDIV = new InstructionFormat(
      109, "ldiv", 0);
  public static final InstructionFormat FDIV = new InstructionFormat(
      110, "fdiv", 0);
  public static final InstructionFormat DDIV = new InstructionFormat(
      111, "ddiv", 0);
  public static final InstructionFormat IREM = new InstructionFormat(
      112, "irem", 0);
  public static final InstructionFormat LREM = new InstructionFormat(
      113, "lrem", 0);
  public static final InstructionFormat FREM = new InstructionFormat(
      114, "frem", 0);
  public static final InstructionFormat DREM = new InstructionFormat(
      115, "drem", 0);
  public static final InstructionFormat INEG = new InstructionFormat(
      116, "ineg", 0);
  public static final InstructionFormat LNEG = new InstructionFormat(
      117, "lneg", 0);
  public static final InstructionFormat FNEG = new InstructionFormat(
      118, "fneg", 0);
  public static final InstructionFormat DNEG = new InstructionFormat(
      119, "dneg", 0);
  // logical instructions
  public static final InstructionFormat ISHL = new InstructionFormat(
      120, "ishl", 0);
  public static final InstructionFormat LSHL = new InstructionFormat(
      121, "lshl", 0);
  public static final InstructionFormat ISHR = new InstructionFormat(
      122, "ishr", 0);
  public static final InstructionFormat LSHR = new InstructionFormat(
      123, "lshr", 0);
  public static final InstructionFormat IUSHR = new InstructionFormat(
      124, "iushr", 0);
  public static final InstructionFormat LUSHR = new InstructionFormat(
      125, "lushr", 0);
  public static final InstructionFormat IAND = new InstructionFormat(
      126, "iand", 0);
  public static final InstructionFormat LAND = new InstructionFormat(
      127, "land", 0);
  public static final InstructionFormat IOR = new InstructionFormat(
      128, "ior", 0);
  public static final InstructionFormat LOR = new InstructionFormat(
      129, "lor", 0);
  public static final InstructionFormat IXOR = new InstructionFormat(
      130, "ixor", 0);
  public static final InstructionFormat LXOR = new InstructionFormat(
      131, "lxor", 0);
  //
  public static final InstructionFormat IINC = new InstructionFormat(
      132, "iinc", 2);
  // conversion operations
  public static final InstructionFormat I2L = new InstructionFormat(
      133, "i2l", 0);
  public static final InstructionFormat I2F = new InstructionFormat(
      134, "i2f", 0);
  public static final InstructionFormat I2D = new InstructionFormat(
      135, "i2d", 0);
  public static final InstructionFormat L2I = new InstructionFormat(
      136, "l2i", 0);
  public static final InstructionFormat L2F = new InstructionFormat(
      137, "l2f", 0);
  public static final InstructionFormat L2D = new InstructionFormat(
      138, "l2d", 0);
  public static final InstructionFormat F2I = new InstructionFormat(
      139, "f2i", 0);
  public static final InstructionFormat F2L = new InstructionFormat(
      140, "f2l", 0);
  public static final InstructionFormat F2D = new InstructionFormat(
      141, "f2d", 0);
  public static final InstructionFormat D2I = new InstructionFormat(
      142, "d2i", 0);
  public static final InstructionFormat D2L = new InstructionFormat(
      143, "d2l", 0);
  public static final InstructionFormat D2F = new InstructionFormat(
      144, "d2f", 0);
  public static final InstructionFormat INT2BYTE = new InstructionFormat(
      145, "int2byte", 0);
  public static final InstructionFormat INT2CHAR = new InstructionFormat(
      146, "int2char", 0);
  public static final InstructionFormat INT2SHORT = new InstructionFormat(
      147, "int2short", 0);
  // control transfer
  public static final InstructionFormat LCMP = new InstructionFormat(
      148, "lcmp", 0);
  public static final InstructionFormat FCMPL= new InstructionFormat(
      149, "fcmpl", 0);
  public static final InstructionFormat FCMPG = new InstructionFormat(
      150, "fcmpg", 0);
  public static final InstructionFormat DCMPL= new InstructionFormat(
      141, "dcmpl", 0);
  public static final InstructionFormat DCMPG = new InstructionFormat(
      152, "dcmpg", 0);
  public static final InstructionFormat IFEQ = new InstructionFormat(
      153, "ifeq", 2);
  public static final InstructionFormat IFNE = new InstructionFormat(
      154, "ifne", 2);
  public static final InstructionFormat IFLT = new InstructionFormat(
      155, "iflt", 2);
  public static final InstructionFormat IFGE = new InstructionFormat(
      156, "ifge", 2);
  public static final InstructionFormat IFGT = new InstructionFormat(
      157, "ifgt", 2);
  public static final InstructionFormat IFLE = new InstructionFormat(
      158, "ifle", 2);
  public static final InstructionFormat IF_ICMPEQ = new InstructionFormat(
      159, "if_icmpeq", 2);
  public static final InstructionFormat IF_ICMPNE = new InstructionFormat(
      160, "if_icmpne", 2);
  public static final InstructionFormat IF_ICMPLT = new InstructionFormat(
      161, "if_icmplt", 2);
  public static final InstructionFormat IF_ICMPGE = new InstructionFormat(
      162, "if_icmple", 2);
  public static final InstructionFormat IF_ICMPGT = new InstructionFormat(
      163, "if_icmpgt", 2);
  public static final InstructionFormat IF_ICMPLE = new InstructionFormat(
      164, "if_icmple", 2);
  public static final InstructionFormat IF_ACMPEQ = new InstructionFormat(
      165, "if_acmpeq", 2);
  public static final InstructionFormat IF_ACMPNE = new InstructionFormat(
      166, "if_acmpne", 2);
  public static final InstructionFormat GOTO = new InstructionFormat(
      167, "goto", 2);
  public static final InstructionFormat JSR = new InstructionFormat(
      168, "jsr", 2);
  public static final InstructionFormat RET = new InstructionFormat(
      169, "ret", 1);
  public static final InstructionFormat TABLESWITCH = new InstructionFormat(
      170, "tableswitch", -1);
  public static final InstructionFormat LOOKUPSWITCH =
    new InstructionFormat(171, "lookupswitch", -1);
  public static final InstructionFormat IRETURN = new InstructionFormat(
      172, "ireturn", 0);
  public static final InstructionFormat LRETURN = new InstructionFormat(
      173, "lreturn", 0);
  public static final InstructionFormat FRETURN = new InstructionFormat(
      174, "freturn", 0);
  public static final InstructionFormat DRETURN = new InstructionFormat(
      175, "dreturn", 0);
  public static final InstructionFormat ARETURN = new InstructionFormat(
      176, "areturn", 0);
  public static final InstructionFormat RETURN = new InstructionFormat(
      177, "return", 0);
  // Manipulating Object Fields
  public static final InstructionFormat GETSTATIC = new InstructionFormat(
      178, "getstatic", 2);
  public static final InstructionFormat PUTSTATIC = new InstructionFormat(
      179, "putstatic", 2);
  public static final InstructionFormat GETFIELD = new InstructionFormat(
      180, "getfield", 2);
  public static final InstructionFormat PUTFIELD = new InstructionFormat(
      181, "putfield", 2);
  public static final InstructionFormat INVOKEVIRTUAL =
    new InstructionFormat(182, "invokevirtual", 2);
  public static final InstructionFormat INVOKENONVIRTUAL =
    new InstructionFormat(183, "invokenonvirtual", 2);
  public static final InstructionFormat INVOKESTATIC =
    new InstructionFormat(184, "invokestatic", 2);
  public static final InstructionFormat INVOKEINTERFACE =
    new InstructionFormat(185, "invokeinterface", 4);
  public static final InstructionFormat NEW = new InstructionFormat(
      187, "new", 2);
  public static final InstructionFormat NEWARRAY = new InstructionFormat(
      188, "newarray", 1);
  public static final byte T_BOOLEAN = 4;
  public static final byte T_CHAR = 5;
  public static final byte T_FLOAT = 6;
  public static final byte T_DOUBLE = 7;
  public static final byte T_BYTE = 8;
  public static final byte T_SHORT = 9;
  public static final byte T_INT = 10;
  public static final byte T_LONG = 11;
  public static final InstructionFormat ANEWARRAY = new InstructionFormat(
      189, "anewarray", 2);
  public static final InstructionFormat arraylength =
    new InstructionFormat(190, "arraylength", 0);
  public static final InstructionFormat ATHROW = new InstructionFormat(
      191, "athrow", 0);
  public static final InstructionFormat CHECKCAST = new InstructionFormat(
      192, "checkcast", 2);
  public static final InstructionFormat INSTANCEOF = new InstructionFormat(
      193, "instanceof", 2);
  public static final InstructionFormat MONITORENTER =
    new InstructionFormat(194, "monitorenter", 0);
  public static final InstructionFormat MONITOREXIT =
    new InstructionFormat(195, "monitorexit", 0);
  public static final InstructionFormat WIDE = new InstructionFormat(
      196, "wide", 1);
  public static final InstructionFormat MULTIANEWARRAY =
    new InstructionFormat(197, "multianewarray", 3);
  public static final InstructionFormat IFNULL = new InstructionFormat(
      198, "ifnull", 2);
  public static final InstructionFormat IFNONNULL = new InstructionFormat(
      199, "ifnonnull", 2);
  public static final InstructionFormat GOTO_W = new InstructionFormat(
      200, "goto_w", 4);
  public static final InstructionFormat JSR_W = new InstructionFormat(
      201, "jsr_w", 4);
  public static final InstructionFormat BREAKPOINT = new InstructionFormat(
      202, "breakpoint", 0);
  public static final InstructionFormat RET_W = new InstructionFormat(
      209, "ret_w", 1);
}
