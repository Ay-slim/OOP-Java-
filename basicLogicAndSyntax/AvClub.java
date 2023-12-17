package basicLogicAndSyntax;
import java.util.Scanner;

public class AvClub {
  public static void main (String[] args) {
    while (true) {
      System.out.print("Enter a word: ");
      Scanner scanner = new Scanner(System.in);
      String inputVal = scanner.nextLine();
      if (inputVal == "") {
        break;
      }
      String[] inputWords = inputVal.split(" ");
      for (String inputWord: inputWords) {
        if (inputWord.contains("av")) {
          System.out.println(inputWord);
        }
      }
      System.out.println(inputWords.length);
    }
  }
}
