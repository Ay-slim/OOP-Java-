import java.util.Scanner;

public class OnlyPositives {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Provide a number: ");
      String value = scanner.nextLine();
      int numberedValue = Integer.valueOf(value);
      if (numberedValue < 0) {
        System.out.println("Unsuitable number");
        continue;
      }
      if (numberedValue == 0) {
        break;
      }
      System.out.println(numberedValue * numberedValue);
    }
  }
}
