package oop;

public class Clock {
  private static ClockHand seconds = new ClockHand(60, "seconds");
  private static ClockHand minutes = new ClockHand(60, "minutes");
  private static ClockHand hours = new ClockHand(24, "hours");

  public static void main (String[] args) {
    while(true) {
      System.out.println(seconds.toString() + " : " + minutes.toString() + " : " + hours.toString());

      seconds.advance();
      if (seconds.value() == 0) {
        minutes.advance();
        if (minutes.value() == 0) {
          hours.advance();
        }
      }
    }
  }
}