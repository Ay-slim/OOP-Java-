package basicLogicAndSyntax;
import java.util.Scanner;

public class SumToN {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Provide a number: ");
    int providedNumber = Integer.valueOf(scanner.nextLine());
    int sumOfValues = 0;
    for (int i = 1; i <= providedNumber; i++) {
      sumOfValues = sumOfValues + i;
    }
    System.out.println("The sum is: " + sumOfValues);
  }
}
