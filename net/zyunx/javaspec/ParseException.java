package net.zyunx.javaspec;

public class ParseException extends RuntimeException {

  private SecondStepSource source;

  public ParseException(SecondStepSource source, String message) {
    super(message);
    this.source = source;
  }
  public ParseException(ThirdStepSource source, String message) {
    super(message);
  }
}
