import java.util.Scanner;

public class MethodInit {
  public static void main(String[] args) {
    System.out.println("Enter number of times: ");
    Scanner scanner = new Scanner(System.in);
    int numOfTimes = Integer.valueOf(scanner.nextLine());
    for (int i = 0; i < numOfTimes; i++) {
      firstMethod();
    }
  }
  public static void firstMethod() {
    System.out.println("First method print");
  }
}
