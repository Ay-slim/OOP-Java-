package oop.overloading;

public class Product {
  private String name;
  private String location;
  private int weight;

  public Product(String name, String location) {
    this.name = name;
    this.location = location;
    this.weight = 1;
  }

  public Product(String name, int weight) {
    this(name, "shelf");
    this.weight = weight;
  }

  public Product(String name) {
    this(name, "shelf");
  }

  public String toString() {
    return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
  }

  public static void main (String[] args) {
    Product tapeMeasure = new Product("Tape measure");
    Product plaster = new Product("Plaster", "home improvement section");
    Product tyre = new Product("Tyre", 5);

    System.out.println(tapeMeasure);
    System.out.println(plaster);
    System.out.println(tyre);
  }
}
