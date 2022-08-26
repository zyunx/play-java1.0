package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NotStarParser {
  
  public static boolean is(SecondStepSource source) {
    if (source.isLineTerminator()) {
      return true;
    } else {
      InputCharacter c = source.getInputCharacter();
      return '*' != c.getChar();
    }
  }

  public static NotStar parse(SecondStepSource source) {
    if (!is(source)) {
      throw new ParseException(source, "NotStart expected.");
    }

    NotStar rst;
    if (source.isLineTerminator()) {
      rst = new NotStar(source.getLineTerminator());
    } else {
      rst = new NotStar(source.getInputCharacter()); 
    }
    source.proceed();
    return rst;
  }
}
