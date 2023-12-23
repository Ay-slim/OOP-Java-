package oop;
import java.util.Scanner;

public class Statistics {
  private int count = 0;
  private int sum = 0;

  public void addNumber(int numArg) {
    this.sum = this.sum + numArg;
    this.count = this.count + 1;
  }
  
  public int average() {
    if (count == 0) {
      return 0;
    }
    return sum/count;
  }

  public static void main (String[] arg) {
    Scanner scanner = new Scanner(System.in);
    Statistics statisticInstance = new Statistics();
    while (true) {
      System.out.print("Enter the number to add: ");
      int numberToAdd = Integer.valueOf(scanner.nextLine());
      if (numberToAdd == -1) {
        System.out.println(statisticInstance.average());
        break;
      }
      statisticInstance.addNumber(numberToAdd);
    }
  }
}
