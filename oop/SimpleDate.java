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

  public void advance(int howManyDays) {
    //this.day += howManyDays;
    int numOfExtraDays = howManyDays % 30;
    this.day += numOfExtraDays;
    int numOfExtraMonths = howManyDays / 30;
    int numOfExtraYears = numOfExtraMonths / 12;
    this.month += numOfExtraMonths;
    if (this.day > 30) {
      this.month++;
      this.day -= 30;
    }
    this.year += numOfExtraYears;
    if (this.month > 12) {
      this.month -= (12 * numOfExtraYears);
    }
  }

  public void advance() {
    this.advance(1);
  }

  public SimpleDate afterNumberOfDays(int days) {
    SimpleDate newDate = new SimpleDate(this.getDay(), this.getMonth(), this.getYear());
    newDate.advance(days);
    return newDate;
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
    // SimpleDate d1 = new SimpleDate(14, 2, 2011);
    // SimpleDate d2 = new SimpleDate(21, 2, 2011);
    // SimpleDate d3 = new SimpleDate(1, 3, 2011);
    // SimpleDate d4 = new SimpleDate(31, 12, 2010);

    // System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
    // System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

    // System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
    // System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

    // System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
    // System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));
    //int idx = 0;
    // SimpleDate d2 = new SimpleDate(21, 2, 2011);
    // while (idx < 365) {
    //   System.out.println(d2);
    //   d2.advance();
    //   idx++;
    // }
    // d2.advance(58);
    // System.out.println(d2);
    SimpleDate date = new SimpleDate(13, 2, 2015);
    System.out.println("Friday of the examined week is " + date);

    SimpleDate newDate = date.afterNumberOfDays(7);
    int week = 1;
    while (week <= 7) {
        System.out.println("Friday after " + week + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);

        week = week + 1;
    }


    System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
    System.out.println("Try " + date.afterNumberOfDays(790));
  }
}
