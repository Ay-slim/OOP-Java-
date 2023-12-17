package basicLogicAndSyntax;
import java.util.Scanner;

public class ArraySwapper {
  public static void main (String[] args) {
    int[] numbers = new int[5];
    for (int i = 0; i < 5; i++) {
      int val = i + 1;
      System.out.println(val);
      numbers[i] = val;
    }
    System.out.print("Provide indices to swap: ");
    Scanner scanner = new Scanner(System.in);
    int firstIndex = Integer.valueOf(scanner.nextLine());
    int secondIndex = Integer.valueOf(scanner.nextLine());
    int helper = numbers[firstIndex];
    numbers[firstIndex] = numbers[secondIndex];
    numbers[secondIndex] = helper;
    for (int number: numbers) {
      System.out.println(number);
    }
  }
}
