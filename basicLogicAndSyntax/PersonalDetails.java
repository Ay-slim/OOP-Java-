package basicLogicAndSyntax;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonalDetails {
  public static void main (String[] args) {
    ArrayList<String[]> userInputs = new ArrayList<>();
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Provide an entry: ");
      String userInput = scanner.nextLine();
      if (userInput == "") {
        break;
      }
      userInputs.add(userInput.split(","));
    }
    int maxNameLength = 0;
    String nameWithMaxLength = "";
    int birthYearSum = 0;
    int numOfEntries = 0;
    for (String[] userInputElement: userInputs) {
      if (userInputElement[0].length() > maxNameLength) {
        maxNameLength = userInputElement[0].length();
        nameWithMaxLength = userInputElement[0];
      }
      birthYearSum = birthYearSum + Integer.valueOf(userInputElement[1]);
      numOfEntries = numOfEntries + 1;
    }
    System.out.println(nameWithMaxLength);
    double averageValue = birthYearSum/numOfEntries;
    System.out.println(averageValue);
  }
}
