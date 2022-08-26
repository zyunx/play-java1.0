package net.zyunx.javaspec;

public class SyntaxException extends RuntimeException {

  private ThirdStepSource source;

  public SyntaxException(ThirdStepSource source, String message) {
    super("line " + source.getToken().getLine() + 
        ", column " + source.getToken().getColumn() + ": " +
        message);
    this.source = source;
  }
}
