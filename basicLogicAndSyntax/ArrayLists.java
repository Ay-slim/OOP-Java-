package basicLogicAndSyntax;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
  public static void main (String[] args) {
    ArrayList<Integer> numArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a name: ");
      int userInput = Integer.valueOf(scanner.nextLine());
      if (userInput == -1) {
        break;
      }
      numArrayList.add(userInput);
    }
    for (int numArrayVal: numArrayList) {
      System.out.println(numArrayVal);
    }
  }
}
