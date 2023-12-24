package oop;

public class ClockHandRaw {

  public static void printToStdOut (String stringArg) {
    System.out.print(stringArg);
  }

  public static void printLnToStdOut (String stringArg) {
    System.out.println(stringArg);
  }

  public static void main (String[] args) {
    int second = 0;
    int minute = 0;
    int hour = 0;
    int day = 0;
  
    while (true) {
      if (second < 10) {
        printToStdOut("0");
      }
      printToStdOut(String.valueOf(second));

      printToStdOut(" seconds");
      printToStdOut(" : ");

      if (minute < 10) {
        printToStdOut("0");
      }
      printToStdOut(String.valueOf(minute));

      printToStdOut(" minutes");
      printToStdOut(" : ");

      if (hour < 10) {
        printToStdOut("0");
      }
      printToStdOut(String.valueOf(hour));

      printToStdOut(" hours");
      printToStdOut(" : ");

      if (day < 10) {
        printToStdOut("0");
      }
      printToStdOut(String.valueOf(day));

      printToStdOut(" days");

      printLnToStdOut("");

      second = second + 1;
      if (second > 59) {
        second = 0;
        minute = minute + 1;
      }

      if (minute > 59) {
        minute = 0;
        hour = hour + 1;
      }

      if (hour > 23) {
        hour = 0;
        day = day + 1;
      }
    }
  }
}
