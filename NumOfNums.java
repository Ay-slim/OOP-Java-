import java.util.Scanner;
public class NumOfNums {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int holder = 0;
    while (true) {
      System.out.println("Provide a number: ");
      int userInput = Integer.valueOf(scanner.nextLine());
      if (userInput == 0) {
        System.out.println(holder);
        break;
      }
      holder = holder + userInput;
    }
  }
}
