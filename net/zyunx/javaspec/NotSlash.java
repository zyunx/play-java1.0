package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NotSlash extends SingleInputElement {
  
  public NotSlash(LineTerminator lineTerm) {
    super(lineTerm);
  }
  public NotSlash(InputCharacter inputChar) {
    super(inputChar);
  }
}
