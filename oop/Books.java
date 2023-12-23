package oop;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {
  private String title;
  private String pages;
  private String pubYear;

  public Books(String titleArg, String pagesArg, String pubYearArg) {
    this.title = titleArg;
    this.pages = pagesArg;
    this.pubYear = pubYearArg;
  }

  public String getTitle() {
    return this.title;
  }

  public String getPages() {
    return this.pages;
  }

  public String getPubYear() {
    return this.pubYear;
  }

  public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
     ArrayList<Books> books = new ArrayList<Books>();
     while (true) {
      System.out.print("Title: ");
      String bookTitle = scanner.nextLine();
      if (bookTitle == "") {
        System.out.print("What information do you want to print? ");
        String printOption = scanner.nextLine();
        System.out.println(printOption == "everything");
        if (printOption.equals("everything")) {
          for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + ", " + books.get(i).getPages() + " pages, " + books.get(i).getPubYear());
          }
        } else {
          for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
          }
        }
        break;
      }
      System.out.print("Pages: ");
      String numPages = scanner.nextLine();
      System.out.print("Year: ");
      String pubYear = scanner.nextLine();
      books.add(new Books(bookTitle, numPages, pubYear));
     }
  }
}
