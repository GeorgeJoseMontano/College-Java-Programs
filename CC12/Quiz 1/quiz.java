/*
Montano, George Jose P.
20190018801

CC 12 B
Quiz (January 25, 2021)

Problem: Write a program that uses a square matrix of order 5 (5x5 array), 
fill the left-to-right diagonal with zeros, the lower left triangle with -1s 
and the upper right triangle with 1s. The output will look something like below:
Use iterations and conditional statements in assigning values to your array. 
Manual assignment is not allowed.

*/
public class quiz
{
	public static void main(String args[])
	{
	int r,c;
	int[][] A = new int[5][5];
	
		for(r=0;r<5;r++)
		{
			for(c=0;c<5;c++)
			{
				if(r<c)
				{
					A[r][c]=1;
				}
				if(c<r)
				{
					A[r][c]=-1;
				}
				if(r==c)
				{
					A[r][c]=0;
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("Matrix is \n");
		for(r=0;r<5;r++)
		{
			for(c=0;c<5;c++)
			{
				System.out.printf("%2d",A[r][c]);
			}
			System.out.println();
		}
	}
}