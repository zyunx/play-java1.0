package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NotSlashParser {
  
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return true;
    } else {
      InputCharacter c = source.getInputCharacter();
      return '/' != c.getChar();
    }
  }

  public static NotSlash parse(SecondStepSource source) {
    if (!is(source)) {
      throw new ParseException(source, "NotSlash expected.");
    }

    NotSlash rst;
    if (source.isLineTerminator()) {
      rst = new NotSlash(source.getLineTerminator());
    } else {
      rst = new NotSlash(source.getInputCharacter()); 
    }
    source.proceed();
    return rst;
  }
}
