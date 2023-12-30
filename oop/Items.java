package oop;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Items {
  private String name;
  private LocalDateTime createdAt;
  private String identifier;

  public Items (String nameArg) {
    this.name = nameArg;
    this.createdAt = LocalDateTime.now();
  }

  public Items (String nameArg, String idArg) {
    this(nameArg);
    this.identifier = idArg;
  }

  public String toString() {
    return this.name + " " + this.identifier + " " + "(created at: " + this.createdAt + ")";
  }

  public String getName() {
    return this.name;
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public boolean equals(Items toCompareWith) {
    if (this == toCompareWith) {
      return true;
    }
    if (
      this.identifier == toCompareWith.getIdentifier()
    ) {
      return true;
    }
    return false;
  }

  public static void main (String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // ArrayList<Items> items = new ArrayList<Items>();
    // while (true) {
    //   System.out.print("Provide an item name: ");
    //   String userInput = scanner.nextLine();
    //   if (userInput == "") {
    //     for (int i = 0; i < items.size(); i++) {
    //       System.out.println(items.get(i));
    //     }
    //     break;
    //   }
    //   Items userItem = new Items(userInput);
    //   items.add(userItem);
    // }

    Scanner scanner = new Scanner(System.in);
    ArrayList<Items> items = new ArrayList<Items>();
    // while (true) {
    //   System.out.println("Identifier? (empty will stop)");
    //   String itemName = scanner.nextLine();
    //   if (itemName == "") {
    //     break;
    //   }
    //   System.out.println("Name? (empty will stop)");
    //   String itemIdentifier = scanner.nextLine();
    //   if (itemIdentifier == "") {
    //     break;
    //   }
    //   items.add(new Items(itemName, itemIdentifier));
    // }
    items.add(new Items("He-Man figure","B07H8ND8HH"));
    items.add(new Items("He-Man","B07H8ND8HH"));
    items.add(new Items("He-Man figure","B07NQFMZYG"));
    items.add(new Items("He-Man figure","B07NQFMZYG"));
    int outerIdx = 1;
    System.out.println(items.get(0));
    boolean wasAlreadyPrinted = false;
    while (outerIdx < items.size()) {
      wasAlreadyPrinted = false;
      for (int innerIdx = 0; innerIdx < outerIdx; innerIdx++) {
        if (items.get(outerIdx).equals(items.get(innerIdx))) {
          wasAlreadyPrinted = true;
          break;
        }
      }
      if (!wasAlreadyPrinted) {
        System.out.println(items.get(outerIdx));
      }
      outerIdx++;
    }
  }
}
