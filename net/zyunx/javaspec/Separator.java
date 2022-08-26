package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public interface Separator extends Token {
  boolean isDot();
  boolean isSemicolon();
  boolean isComma();
  boolean is(char c);
}
