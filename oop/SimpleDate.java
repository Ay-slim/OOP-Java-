package oop;

public class SimpleDate {
  private int day;
  private int month;
  private int year;

  public SimpleDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return this.day;
  }

  public int getMonth() {
    return this.month;
  }

  public int getYear() {
    return this.year;
  }

  @Override
  public String toString() {
    return this.day + "." + this.month + "." + this.year;
  }

  public boolean before(SimpleDate dateToCompare) {
    if (this.year < dateToCompare.getYear()) {
      return true;
    }
    if (this.year > dateToCompare.getYear()) {
      return false;
    }
    if (this.month < dateToCompare.getMonth()) {
      return true;
    }
    if (this.month > dateToCompare.getMonth()) {
      return false;
    }
    if (this.day < dateToCompare.getDay()) {
      return true;
    }
    return false;
  }

  public boolean equals(Object compared) {
    // if the variables are located in the same position, they are equal
    if (this == compared) {
        return true;
    }

    // if the type of the compared object is not SimpleDate, the objects are not equal
    if (!(compared instanceof SimpleDate)) {
        return false;
    }

    // convert the Object type compared object
    // into a SimpleDate type object called comparedSimpleDate
    SimpleDate comparedSimpleDate = (SimpleDate) compared;

    // if the values of the object variables are the same, the objects are equal
    if (this.day == comparedSimpleDate.day &&
        this.month == comparedSimpleDate.month &&
        this.year == comparedSimpleDate.year) {
        return true;
    }

    // otherwise the objects are not equal
    return false;
}

  public static void main(String[] args) {
    SimpleDate d1 = new SimpleDate(14, 2, 2011);
    SimpleDate d2 = new SimpleDate(21, 2, 2011);
    SimpleDate d3 = new SimpleDate(1, 3, 2011);
    SimpleDate d4 = new SimpleDate(31, 12, 2010);

    System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
    System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

    System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
    System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

    System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
    System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));
  }
}
