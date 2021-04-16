/**
  	Montano, George Jose P.
	20190018801

	CC 12 B
	Exercise

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
	int x = a[0]; 
    for(int i=1;i<a.length;i++){ 
      if(a[i] < x){ 
        x = a[i]; 
      } 
    } 
    return x; 
  }

  /**
    * 2. Implement this method
    * getMax returns the element of theArray with the maximum value
    */
  public static int getMax(int[] a) {
	int y = a[0]; 
    for(int i=1;i < a.length;i++){ 
      if(a[i] > y){ 
         y = a[i]; 
      } 
    } 
    return y; 
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
