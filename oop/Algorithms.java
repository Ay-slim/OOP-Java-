package oop;

import java.util.Arrays;

public class Algorithms {
  public static int smallest(int[] array){
    int idx = 1;
    int smallestVal = array[0];
    int smallestIdx = 0;
    while (idx < array.length) {
      if (array[idx] < smallestVal) {
        smallestVal = array[idx];
        smallestIdx = idx;
      }
      idx++;
    }
    return smallestVal;
  }

  public static int indexOfSmallest(int[] array){
    int idx = 1;
    int smallestVal = array[0];
    int smallestIdx = 0;
    while (idx < array.length) {
      if (array[idx] < smallestVal) {
        smallestVal = array[idx];
        smallestIdx = idx;
      }
      idx++;
    }
    return smallestIdx;
  }

  public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int idx = startIndex + 1;
    int smallestVal = table[startIndex];
    int smallestIdx = startIndex;
    while (idx < table.length) {
      if (table[idx] < smallestVal) {
        smallestVal = table[idx];
        smallestIdx = idx;
      }
      idx++;
    }
    return smallestIdx;
  }

  public static void swap(int[] array, int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
  public static void main(String[] arg) {
    int[] testArr = {4, 5, 1, 8};
    //Algorithms algo = new Algorithms();
    System.out.println(smallest(testArr));
    System.out.println(indexOfSmallest(testArr));

    int[] numbers = {-1, 6, 9, 8, 12};
    System.out.println(Algorithms.indexOfSmallestFrom(numbers, 0));
    System.out.println(Algorithms.indexOfSmallestFrom(numbers, 1));
    System.out.println(Algorithms.indexOfSmallestFrom(numbers, 2));

    int[] numberss = {3, 2, 5, 4, 8};

    System.out.println(Arrays.toString(numberss));

    Algorithms.swap(numberss, 1, 0);
    System.out.println(Arrays.toString(numberss));

    Algorithms.swap(numberss, 0, 3);
    System.out.println(Arrays.toString(numberss));
  }
}