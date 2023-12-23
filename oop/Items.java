package oop;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Items {
  private String name;
  private LocalDateTime createdAt;

  public Items (String nameArg) {
    this.name = nameArg;
    this.createdAt = LocalDateTime.now();
  }

  public String toString() {
    return this.name + " " + "(created at: " + this.createdAt + ")";
  }

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Items> items = new ArrayList<Items>();
    while (true) {
      System.out.print("Provide an item name: ");
      String userInput = scanner.nextLine();
      if (userInput == "") {
        for (int i = 0; i < items.size(); i++) {
          System.out.println(items.get(i));
        }
        break;
      }
      Items userItem = new Items(userInput);
      items.add(userItem);
    }
  }
}
