package net.zyunx.common;

public class Assert {

  public static void impossible(String message) {
    throw new IllegalStateException(message);
  }

  public static void assertArg(boolean b, String message) {
    if (!b) {
      throw new IllegalArgumentException(message);
    }
  }
  public static void assertTrue(boolean b, String message) {
    if (!b) {
      throw new IllegalStateException(message);
    }
  }
}
