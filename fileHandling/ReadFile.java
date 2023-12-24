package fileHandling;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFile {
  public static void main (String[] args) {
    Scanner txtScanner = new Scanner(System.in);
    System.out.print("What file do you want to print? ");
    String textToPrint = txtScanner.nextLine();
    try (Scanner scanner = new Scanner(Paths.get(textToPrint + ".txt"))) {

      // we read the file until all lines have been read
      while (scanner.hasNextLine()) {
          // we read one line
          String row = scanner.nextLine();
          // we print the line that we read
          System.out.println(row);
      }
  } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
