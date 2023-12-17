package basicLogicAndSyntax;
import java.util.ArrayList;

public class PrintInRange {
  public static void main (String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(8);
    numbers.add(80);
    numbers.add(15);
    numbers.add(10);
    numbers.add(12);
    printNumbersInRange(numbers, 10, 50);
  }
  public static void printNumbersInRange (ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    for (int number: numbers) {
      if (number >= lowerLimit && number <= upperLimit) {
        System.out.println(number);
      }
    }
  }
}