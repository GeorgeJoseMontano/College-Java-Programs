/**
  * Problem 2
  * Given an array with size N and an integer k, find all elements of the array that appears more than
  * N/k times.
  *
  * Example: given the array, and the number k
  *
  *   int[] theArray = {24, 4, 4, 78, 30, 5, 30, 4, 63, 4, 4, 30, 30, 24}
  *   int k = 4

  *   The output should be:
  *     30, 4
  *
  *   because N/k = 14/4 == 3
  *   (30 appears 4 times, 4 appears 5 times)
  *
  * Your task is to modify this code to solve for the above.
  */
public Problem2 {

  // implement this method
  public void findElement(int[] array, int k) {

  }

  public static void main(String args[]) {

    int[] theArray = {24, 4, 4, 78, 30, 5, 30, 4, 63, 4, 4, 30, 30, 24};
    int k = 4;

    // should output 30, 4 (could be displayed in any order)
    findElement(theArray, k);
  }
}
