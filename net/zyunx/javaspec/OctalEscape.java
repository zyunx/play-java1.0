package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import net.zyunx.common.UnsupportedOperationException;
import java.util.Vector;

public class OctalEscape implements Escape {
  
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<OctalEscape<");
    sb.append(">");
    return sb.toString();
  }
}
