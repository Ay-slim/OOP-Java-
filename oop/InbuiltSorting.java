package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {
  public static void sort(int[] array) {
    System.out.println(Arrays.toString(array));
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void sort(String[] array){
    System.out.println(Arrays.toString(array));
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void sortIntegers(ArrayList<Integer> integers) {
    System.out.println(integers);
    Collections.sort(integers);
    System.out.println(integers);
  }

  public static void sortStrings(ArrayList<String> strings) {
    System.out.println(strings);
    Collections.sort(strings);
    System.out.println(strings);
  }

  public static void main(String[] args) {
    int[] integers = {8, 5, 9, 4, 2, 3, 0, 1};
    InbuiltSorting.sort(integers);
    String[] strings = {"dude", "what", "the", "fuck"};
    InbuiltSorting.sort(strings);
    ArrayList<Integer> numbersArr = new ArrayList<>();
    numbersArr.add(8);
    numbersArr.add(3);
    numbersArr.add(7);
    InbuiltSorting.sortIntegers(numbersArr);
    ArrayList<String> stringsArr = new ArrayList<>();
    stringsArr.add("what");
    stringsArr.add("the");
    stringsArr.add("fuck");
    InbuiltSorting.sortStrings(stringsArr);
  }
}