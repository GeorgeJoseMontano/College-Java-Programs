/**
	Montano, George Jose P.
	20190018801

	CC 12 B
	Exercise

	Problem 3
	Magic Index
	Given a sorted array of distinct integers, find the Magic index or fixed point in the array.
	Magic Index or Fixed Point: Magic index or a Fixed point in an array is an index i in the array such that A[i] = i.

	Example :

	int[] A = { -1, 0, 1, 2, 4, 10 };

	Magic index or fixed point is : 4

	Note: additional pogi points for those who can implement a binary search algorithm.
  */
  
  public class MagicIndex {
	
	public int search(int[] A, int start, int end) // perform binary search
	{
		if (start <= end) 
		{
			int mid = (start + end) / 2;
			if (mid == A[mid]) // check if number is a fixed point
			{
				return mid;
			}
			if (mid > A[mid]) // fixed point might be on the right half of the array
			{
				return search(A, mid + 1, end);
			} 
			else // fixed point might be on the left half of the array
			{	
				return search(A, start, mid - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] A = { -1, 0, 1, 2, 4, 10 };
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.search(A, 0, A.length - 1));
	}

}