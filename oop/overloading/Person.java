package oop.overloading;

import oop.SimpleDate;

public class Person {

  private String name;
  private int age;
  private int height;
  private int weight;
  private SimpleDate birthday;

  public Person(String name, int height, int weight) {
    this.name = name;
    this.age = 1;
    this.weight = weight;
    this.height = height;
  }

  public Person(String name) {
      this(name, 0, 0);
  }

  public Person(String name, SimpleDate date) {
    this.name = name;
    this.birthday = date;
  }

  public Person(String name, int day, int month, int year) {
    this.name = name;
    this.birthday = new SimpleDate(day, month, year);
  }

  public Person(String name, SimpleDate date, int height, int weight) {
    this.name = name;
    this.birthday = date;
    this.height = height;
    this.weight = weight;
  }

  public void printPerson() {
      System.out.println(this.name + " is " + this.age + " years old");
  }

  public void growOlder() {
      this.age++;
  }

  public boolean isAdult() {
      if (this.age < 18) {
          return false;
      }

      return true;
  }

  public double bodyMassIndex() {
      double heightInMeters = this.height / 100.0;

      return this.weight / (heightInMeters * heightInMeters);
  }

  public String toString() {
      return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
  }

  public void setHeight(int height) {
      this.height = height;
  }

  public int getHeight() {
      return this.height;
  }

  public int getWeight() {
      return this.weight;
  }

  public void setWeight(int weight) {
      this.weight = weight;
  }

  public String getName() {
      return this.name;
  }

  public SimpleDate getBirthday() {
    return this.birthday;
  }

  public boolean equals(Object compared) {
    // if the variables are located in the same position, they are equal
    if (this == compared) {
        return true;
    }

    // if the compared object is not of type Person, the objects are not equal
    if (!(compared instanceof Person)) {
        return false;
    }

    // convert the object into a Person object
    Person comparedPerson = (Person) compared;

    // if the values of the object variables are equal, the objects are equal
    if (this.name.equals(comparedPerson.name) &&
        this.age == comparedPerson.age &&
        this.weight == comparedPerson.weight &&
        this.height == comparedPerson.height &&
        this.birthday.equals(comparedPerson.getBirthday())) {
        return true;
    }

    // otherwise the objects are not equal
    return false;
  }

  public static void main(String[] args) {
    // Person paul = new Person("Paul", 57, 180);
    // Person eve = new Person("Eve");

    // System.out.println(paul);
    // System.out.println(eve);
    SimpleDate date = new SimpleDate(24, 3, 2017);
    SimpleDate date2 = new SimpleDate(23, 7, 2017);

    Person leo = new Person("Leo", date, 62, 9);
    Person lily = new Person("Lily", date2, 65, 8);
    Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
    Person sameLeo = new Person("Leo", date, 62, 9);

    System.out.println("Leo and Lily should return false: " + leo.equals(lily));
    System.out.println("Leo and Leo with different weight should return false: " + leo.equals(leoWithDifferentWeight));
    System.out.println("Leo and sameLeo should return true: " + leo.equals(sameLeo));
  }
}
