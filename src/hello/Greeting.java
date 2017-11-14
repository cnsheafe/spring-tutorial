package hello;

import org.joda.time.LocalTime;

public class Greeting {
  private final String message;
  private final String timestamp;

  public Greeting(String msg, LocalTime time) {
    message = msg;
    timestamp = time.toString();
  }

  public String getMessage() {
    return message;
  }

  public String getTimestamp() {
    return timestamp;
  }
}