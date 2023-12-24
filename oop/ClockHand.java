package oop;

public class ClockHand {
  private int limit;
  private int value;
  private String name;

  public ClockHand (int lim, String nameArg) {
    this.limit = lim;
    this.value = 0;
    this.name = nameArg;
  }

  public int value() {
    return this.value;
  }

  public void advance() {
    this.value = this.value + 1;
    if (this.value >= this.limit) {
      this.value = 0;
    }
  }

  public String toString() {
    if(this.value < 10) {
      return "0" + this.value + " " + this.name;
    }
    return String.valueOf(this.value)  + " " + this.name;
  }

  public static void main (String[] args) {
    ClockHand second = new ClockHand(60, "seconds");
    ClockHand minute = new ClockHand(60, "minutes");
    ClockHand hour = new ClockHand(24, "hours");
    ClockHand day = new ClockHand(7, "days");

    while(true) {
      System.out.println(second.toString() + " : " + minute.toString() + " : " + hour.toString() + " : " + day.toString());
      second.advance();
      if (second.value() == 0) {
        minute.advance();
        if (minute.value() == 0) {
          hour.advance();
          if (hour.value() == 0) {
            day.advance();
          }
        }
      }
    }
  }
}
