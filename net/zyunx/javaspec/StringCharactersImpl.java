package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class StringCharactersImpl
  implements StringCharacters {
  
  private Vector stringCharacters = new Vector();

  public StringCharactersImpl(Vector chars) {
    this.stringCharacters = chars;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < stringCharacters.size(); i++) {
      sb.append(stringCharacters.elementAt(i));
    }
    return sb.toString();
  }
}
