package fileHandling;
import java.util.Scanner;
import java.nio.file.Paths;

public class SearchFile {
  public static void main (String[] args) {
    Scanner textScanner = new Scanner(System.in);
    System.out.print("What file do you want to search? ");
    String fileToSearch = textScanner.nextLine();
    Boolean foundWord = false;
    try (Scanner fileScanner = new Scanner(Paths.get(fileToSearch + ".txt"))) {
      System.out.print("What word are you looking for? ");
      String wordToSearch = textScanner.nextLine();
      while (fileScanner.hasNextLine()) {
        String row = fileScanner.nextLine();
        String[] wordsList = row.split(" ");
        for (int i = 0; i < wordsList.length; i++) {
          if (wordsList[i].equals(wordToSearch)) {
            foundWord = true;
            break;
          }
        }
      }
      if (foundWord) {
        System.out.println("Found!");
      } else {
        System.out.println("Not found!");
      }
    } catch(Exception e) {
      System.out.println("Failed to read file " + e.getMessage());
    }
  }
}
