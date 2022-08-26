package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class NotStar extends SingleInputElement {
  
  public NotStar(LineTerminator lineTerm) {
    super(lineTerm);
  }
  public NotStar(InputCharacter inputChar) {
    super(inputChar);
  }
}
