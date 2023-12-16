package basicLogicAndSyntax;
public class PrintingStars {
  public static void main(String[] args) {
    // printStars(5);
    // printStars(3);
    // printStars(9);
    // printSquare(5);
    // printRectangle(17, 3);
    // printTriangle(4);
    // printSpaces(3);
    // printTriangleLeanRight(4);
    printChristmasTree(20);
  }
  public static void printSpaces (int numOfTimes) {
    for (int i = 0; i < numOfTimes; i++) {
      System.out.print(" ");
    }
  }
  public static void printStars(int numOfTimes) {
    int i = 0;
    while (i < numOfTimes) {
      System.out.print('*');
      i++;
    }
    System.out.println("");
  }
  public static void printStarsNoNewLine(int numOfTimes) {
    int i = 0;
    while (i < numOfTimes) {
      System.out.print('*');
      i++;
    }
  }
  public static void printTriangle(int size) {
    for (int i = 1; i <= size; i++) {
      printStars(i);
    }
  }
  public static void printRectangle (int width, int height) {
    for (int i = 0; i < height; i++) {
      printStars(width);
    }
  }
  public static void printSquare(int size) {
    for (int i = 0; i < size; i++) {
      printStars(size);
    }
  }
  public static void printTriangleLeanRight(int size) {
    for (int i = 1; i <= size; i++) {
      printSpaces(size - i);
      printStarsNoNewLine(i);
      System.out.println("");
    }
  }
  public static void printChristmasTree (int height) {
    int base = (height * 2) - 1;
    for (int i = 1; i <= height; i++) {
      int starLen = (i * 2) - 1;
      int spaceLen = (base - starLen) / 2;
      printSpaces(spaceLen);
      printStarsNoNewLine(starLen);
      printSpaces(spaceLen);
      System.out.println("");
    }
    for (int i = 1; i <= 2; i++) {
      int spaceLen = (base - 3) / 2;
      printSpaces(spaceLen);
      printStarsNoNewLine(3);
      printSpaces(spaceLen);
      System.out.println("");
    }
  }
}
