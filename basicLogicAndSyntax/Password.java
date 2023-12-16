package basicLogicAndSyntax;
import java.util.Scanner;

public class Password {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Supply the password: ");
    String password = scanner.nextLine();
    if (password.equals("Dangbana Orisha")) {
      System.out.println("Correct password!");
    } else {
      System.out.println("Incorrect password!");
    }
  }  
}
