/**
	Montano, George Jose P.
	20190018801

	CC 12 B
	Exercise

  * Problem 3
	Smallest sub-Array

	Given an array of integers and an integer, k, find the smallest subarray whose sum is greater than k.

	Example 1:
	  int theArray = { 1, 5, 20, 70, 8}
	  int k  = 97

	  Output:
		subarray = 20, 70, 8
		min length = 3

	Example 2:
	  int theArray = { 1, 10, 3, 40, 18}
	  int k  = 50

	  Output:
		subarray = 40, 18
		min length = 2

	In your program, make theArray (the size, and the elements), and k be inputted by the user.
  */
import java.util.Scanner;
class subArray
{
    public static int findSmallestSubarrayLen(int[] A, int k)
    {
        int windowSum = 0;
        int len = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < A.length; right++)
        {
            windowSum += A[right];

			while (windowSum > k && left <= right)
            {
                // update the result if the current window's length is less than the minimum found so far
                len = Integer.min(len, right - left + 1);
 
                windowSum -= A[left];// remove elements from the window's left side 
                left++;	
            }
        }
        return len;
    }
 
    public static void main(String[] args)
    {
		Scanner in=new Scanner (System.in);//inputs
		System.out.println("Enter the Size of the Array: ");
		int size = in.nextInt();
        int A[]=new int[size];
		System.out.println("Input Elements of the Array: ");
		for (int i=0;i<A.length;i++) 
		{
            System.out.println("enter a number");
            A[i]=in.nextInt();
        }
		System.out.println("Enter the Integer k: ");
		int k = in.nextInt();
		
        int len = findSmallestSubarrayLen(A, k);
 
        if (len != Integer.MAX_VALUE) 
		{
			System.out.println();
            System.out.println("The smallest subarray length is " + len);
        } 
		else 
		{
			System.out.println();
            System.out.println("No subarray exists");
        }
    }
}