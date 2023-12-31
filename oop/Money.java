package oop;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
      int totalCents = this.cents + addition.cents();
      int totalEuros = this.euros + addition.euros();
      if (totalCents >= 100) {
        totalEuros++;
        totalCents -= 100;
      }
      Money newMoney = new Money(totalEuros, totalCents); // create a new Money object that has the correct worth
  
      // return the new Money object
      return newMoney;
    }

    public boolean lessThan(Money compared) {
      if (this.euros == compared.euros()) {
        return this.cents < compared.cents();
      }
      return this.euros < compared.euros();
    }

    public Money minus(Money subtraction) {
      int newEuros;
      int newCents;

      if (this.lessThan(subtraction) || (this.euros == subtraction.euros() && this.cents == subtraction.cents())) {
        return new Money(0, 0);
      }

      if (this.cents < subtraction.cents()) {
        newCents = 100 + this.cents - subtraction.cents();
        newEuros = this.euros - 1 - subtraction.euros();
      } else {
        newCents = this.cents - subtraction.cents();
        newEuros = this.euros - subtraction.euros();
      }
      return new Money(newEuros, newCents);
    }

    public static void main(String[] args) {
      // Money a = new Money(10,0);
      // Money b = new Money(5,0);

      // Money c = a.plus(b);

      // System.out.println(a);  // 10.00e
      // System.out.println(b);  // 5.00e
      // System.out.println(c);  // 15.00e

      // a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
      // //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

      // System.out.println(a);  // 25.00e
      // System.out.println(b);  // 5.00e
      // System.out.println(c);  // 15.00e
      // Money a = new Money(10, 0);
      // Money b = new Money(3, 0);
      // Money c = new Money(5, 0);

      // System.out.println(a.lessThan(b));  // false
      // System.out.println(b.lessThan(c));  // true
      Money a = new Money(10, 0);
      Money b = new Money(3, 50);

      Money c = a.minus(b);

      System.out.println(a);  // 10.00e
      System.out.println(b);  // 3.50e
      System.out.println(c);  // 6.50e

      c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
      //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


      System.out.println(a);  // 10.00e
      System.out.println(b);  // 3.50e
      System.out.println(c);  // 0.00e
    }
}
