import java.util.Scanner;

public class FloatingPoint {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a floating point number");
      String message = scanner.nextLine();
      double converted = Double.valueOf(message);
      System.out.println("Converted value is: " + converted);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
