package oop;

import java.util.ArrayList;

public class SimpleCollection {
  private ArrayList<String> collection;
  private String name;

  public SimpleCollection(String name) {
    this.name = name;
    this.collection = new ArrayList<>();
  }

  public void add(String strVal) {
    this.collection.add(strVal);
  }

  public String longest() {
    if (this.collection.size() == 0) {
      return null;
    }
    String longestString = "";
    for (String strVal: this.collection) {
      if (strVal.length() > longestString.length()) {
        longestString = strVal;
      }
    }
    return longestString;
  }

  public String toString() {
    String str = "";
    int idx = 0;
    int collectionLength = this.collection.size();
    while (idx < collectionLength) {
      if (idx == collectionLength) {
        str = str + this.collection.get(idx);
      } else {
        str = str + this.collection.get(idx) + ", ";
      }
    }
    return str;
  }

  public static void main(String[] args) {
    SimpleCollection j = new SimpleCollection("characters");
    System.out.println("Longest: " + j.longest());

    j.add("magneto");
    j.add("mystique");
    j.add("phoenix");

    System.out.println("Longest: " + j.longest());
  }
}
