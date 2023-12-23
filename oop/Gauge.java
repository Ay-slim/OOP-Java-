package oop;

public class Gauge {
  private int value;

  public void increase() {
    this.value = this.value + 1;
  }

  public void decrease() {
    if (this.value > 0) {
      this.value = this.value - 1;
    }
  }

  public int value() {
    return this.value;
  }

  public boolean full() {
    return this.value == 5;
  }

  public String toString() {
    return "Gauge documentation. Just to show how it works.";
  }

  public static void main (String[] args) {
    Gauge g = new Gauge();

    System.out.println(g);

    while(!g.full()) {
        System.out.println("Not full! Value: " + g.value());
        g.increase();
    }

    System.out.println("Full! Value: " + g.value());
    g.decrease();
    System.out.println("Not full! Value: " + g.value());
  }
}
