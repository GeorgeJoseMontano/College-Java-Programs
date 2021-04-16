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
import java.util.*;
class Problem2 {

  static void findElement(int arr[], int K)
{
    
    Arrays.sort(arr);// Sort the array, arr[]
 
    
    for (int i = 0; i < arr.length;) {// Tranverse the array
 		
		int count = 1;// Stores frequency of arr[i]
		
        while ((i + 1) < arr.length && arr[i] == arr[i + 1]) // Traverse array elements which is equal to arr[i]
		{           
            count++;// Update count
            i++;
        }
 
        if (count > (arr.length / K)) 
		{
            System.out.print(arr[i]+ " ");
        }
        i++;
    }
}

  public static void main(String args[]) {

    int[] theArray = {24, 4, 4, 78, 30, 5, 30, 4, 63, 4, 4, 30, 30, 24};
    int k = 4;
	int N = theArray.length;
    // should output 30, 4 (could be displayed in any order)
    //findElement(theArray, k);
	findElement(theArray, k);
  }
}
