package oop;

public class Timer {
  private int seconds;
  private int hundSeconds;

  public String toString() {
    return seconds + ":" + hundSeconds;
  }

  public void advance() {
    this.hundSeconds = this.hundSeconds + 1;
    if (this.hundSeconds >= 100) {
      this.hundSeconds = 0;
      this.seconds = this.seconds + 1;
    }
  }

  public static void main(String[] arg) {
    Timer timer = new Timer();
    //System.out.println("timerrrr");

    while (true) {
      System.out.println(timer);
      timer.advance();

      try {
          Thread.sleep(10);
      } catch (Exception e) {

      }
    }
  }
}
