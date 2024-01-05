package oop;

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
    return smallestIdx;
  }
  public static void main(String[] arg) {
    int[] testArr = {4, 5, 7, 8};
    //Algorithms algo = new Algorithms();
    System.out.println(smallest(testArr));
  }
}