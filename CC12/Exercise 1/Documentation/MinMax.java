/**
  * Problem 1
  * Look for the minimum / or the maximum element in an array
  *
  * Todo: Implement the methods getMin() and getMax()
  */
class MinMax {

  // constructor, does nothing
  public MinMax() {

  }

  /*
   *  1. Implement this method
   *  getMin returns the element of theArray with the minimum value
   */
  public static int getMin(int[] a) {

    return 1;
  }

  /**
    * 2. Implement this method
    * getMax returns the element of theArray with the maximum value
    */
  public static int getMax(int[] a) {

    return 2;
  }

  /*
   * Use this method to test/check your implementation
   */
  public static void main(String args[]) {

    /*
     * Your task is to implement both the getMin and getMax methods such that the following
     * code will produce the correct output.
     * Note: write your version of getMin/getMax, do not use built-in methods
     */
    int[] theArray = {12,23,3,44,57,90,86,32,56};

    System.out.println( "Minimum element of the array: " + getMin(theArray));
    System.out.println( "Maximum element of the array: " + getMax(theArray));
  }
}
