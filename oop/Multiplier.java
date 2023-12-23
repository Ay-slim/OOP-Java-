package oop;

public class Multiplier {
  private int baseMultiplier;

  public Multiplier (int initializer) {
    this.baseMultiplier =initializer;
  }

  public int multiply (int multiplierArg) {
    return this.baseMultiplier * multiplierArg;
  }

  public static void main (String [] args) {
    Multiplier multiplyByThree = new Multiplier(3);
    System.out.println("Should print 6: " + multiplyByThree.multiply(2));
  }
}
