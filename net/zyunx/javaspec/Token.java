package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public interface Token {
  String getText();
  int getLine();
  int getColumn();
}
