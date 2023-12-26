package oop;

import oop.overloading.Person;

public class HealthStation {

  private int numberOfWeighings = 0;

  public int weigh(Person person) {
    this.numberOfWeighings++;
    return person.getWeight();
  }

  public void feed(Person person) {
    person.setWeight(this.weigh(person) + 1);
  }

  public int weighings() {
    return this.numberOfWeighings;
  }
  public static void main(String[] args) {
    // example main program for the first section of the exercise

    HealthStation childrensHospital = new HealthStation();

    Person ethan = new Person("Ethan", 1, 110, 7);
    Person peter = new Person("Peter", 33, 176, 85);

    // System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    // System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

    // childrensHospital.feed(ethan);
    // childrensHospital.feed(ethan);
    // childrensHospital.feed(ethan);

    // System.out.println("");

    // System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    // System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
    System.out.println("weighings performed: " + childrensHospital.weighings());

    childrensHospital.weigh(ethan);
    childrensHospital.weigh(peter);

    System.out.println("weighings performed: " + childrensHospital.weighings());

    childrensHospital.weigh(ethan);
    childrensHospital.weigh(ethan);
    childrensHospital.weigh(ethan);
    childrensHospital.weigh(ethan);

    System.out.println("weighings performed: " + childrensHospital.weighings());
  }
}
