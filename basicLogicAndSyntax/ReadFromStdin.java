package basicLogicAndSyntax;
import java.util.Scanner;

public class ReadFromStdin {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Write something you muthafucka: ");
      String message = scanner.nextLine();
      System.out.println("The message is: " + message);
    }
  }
}