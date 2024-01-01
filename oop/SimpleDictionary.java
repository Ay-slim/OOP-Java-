package oop;

import java.util.ArrayList;

public class SimpleDictionary {
  private ArrayList<String> dict = new ArrayList<String>();

  public void add(String word, String translation) {
    this.dict.add(word);
    this.dict.add(translation);
  }

  public String translate(String word) {
    int idx = 0;
    while (idx < this.dict.size()) {
      if (this.dict.get(idx).equals(word)) {
        if (idx % 2 == 0) {
          return this.dict.get(idx + 1);
        } else {
          return this.dict.get(idx - 1);
        }
      }
      idx++;
    }
    return null;
  }

  public static void main (String[] args) {
    SimpleDictionary book = new SimpleDictionary();
    book.add("one", "yksi");
    book.add("two", "kaksi");

    System.out.println(book.translate("one"));
    System.out.println(book.translate("two"));
    System.out.println(book.translate("three"));
  }
}
