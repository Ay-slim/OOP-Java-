package oop.overloading;

public class Person {

  private String name;
  private int age;
  private int height;
  private int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public Person(String name) {
      this(name, 1, 0, 0);
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

  public static void main(String[] args) {
    Person paul = new Person("Paul", 24, 57, 180);
    Person eve = new Person("Eve");

    System.out.println(paul);
    System.out.println(eve);
  }
}