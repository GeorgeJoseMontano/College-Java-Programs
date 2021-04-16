/*
Montano, George Jose P.
20190018801

CC 12 B
ACTIVITY 2

Problem: Create a program that can accept any number of integers (as needed) by the user. 
The program should ask the user on the number of integers he/she wishes to enter. 
Then let the user enter those integers in no particular order. 

1. Your task is to insert each integer into the array and make sure that for each insertion, the array stays sorted in ascending order.
2. The program should allow the user the delete a previously entered integer.
3. Do not allow the user to enter more than the previously identified number of integers.

Hint: you may want to create a menu to enable the user to choose which function to perform.
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R, C, choice;
		int x, y;
		int count=1;
		
		//user input for array size
		System.out.println();
		System.out.println("Let's Start by Creating an Array");
		System.out.println();
		System.out.println("Enter Size of the Array you Want to Create: ");
		R = input.nextInt();
		System.out.println();
		//declare array
		int[] A = new int[R];
		
		//input elements to array
		for( int r=0;r<R;r++){
				count_suffix(count);//method for outputing 1st and 2nd properly
				A[r] =input.nextInt();
				count++;
		}
		
		//print the original array
		System.out.println();
		System.out.println("The Original Array is: ");
		printArray(A);
		System.out.println();
		//sort array and print
		System.out.println("After Arranging the Elements: ");
		insertionSort(A);
		printArray(A);
		System.out.println();
		
		//ADD OR DELETE MENU
		System.out.println();
		System.out.println("Do You Wish to Add to or Delete an Element from the Array?");
		System.out.println("1. Add   2. Delete   3. Exit");
		
		choice = input.nextInt();
			if(choice == 1 )
			{
				System.out.println("Enter Element to be Added: ");
				x = input.nextInt();// element to be added
				addX(R, A, x);  // call the method to add x in arr 
			}			
        
			if(choice == 2 )
			{
				System.out.println("Enter Element to be Removed: ");
				y = input.nextInt(); // element to be removed
				minusX(R, A, y);  // call the method to remove y in arr 
			}
			else
			{
				System.exit(0);
			}
	}
	
	//INSERTION METHOD
    public static void addX(int n, int arr[], int x) 
    {   
        // create a new array of size n+1 
        int newarr[] = new int[n + 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (int i = 0; i < n; i++) 
		{
            newarr[i] = arr[i]; 
		}
        newarr[n] = x; 
		insertionSort(newarr);
		System.out.println();
		System.out.println("The New Array is: ");
        printArray(newarr);
		System.out.println();
    } 
	
	//DELETION METHOD
	public static void minusX(int n, int arr[], int x) 
    {   
		if (arr == null) 
		{ 
            System.out.println("No removal operation can be performed!!");
        } 
		
        // create a new array of size n-1 
        int newarr[] = new int[n - 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till x=element
        // which we pass over
        try
		{
			for (int i = 0, k=0; i < arr.length; i++) 
			{
				if (arr[i] == x) 
				{ 
				continue; 
				}
				else
				{
				newarr[k++] = arr[i];
				}
			}
		}catch(Exception e) {
        System.out.println("Chosen Element Does Not Exist in Array");//catch in case of exception error
		System.exit(0);
		}
		System.out.println();
		System.out.println("The New Array is: ");
        printArray(newarr);
		System.out.println();
    } 
	
	//ARRANGE NUMBERS METHOD
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }
	}		
	
	//PRINT ARRAY METHOD
	public static void printArray(int Array[])
	{
		System.out.println();
		for( int r=0;r<Array.length;r++)
		{
			System.out.printf("%2d", Array[r]);
			System.out.print(" ");
		}
		System.out.println();
	}
		
	//COUNT SUFFIX METHOD FOR 1ST AND 2ND
	public static void count_suffix(int num)
	{
		if (num == 1)
		{
			System.out.println("Enter the "+num+"st Element of the Array");
		}
		if (num == 2)
		{
			System.out.println("Enter the "+num+"nd Element of the Array");
		}
		if (num != 1 && num != 2)
		{
			System.out.println("Enter the "+num+"th Element of the Array");
		}
	}
	
	/*HOW TO IMPROVE THE PROGRAM? I CAN TURN THE MENU INTO A LOOP WHERE USERS CAN ADD OR REMOVE ELEMENTS UNTIL THEY CHOOSE TO EXIT
	THE PROGRAM. THE METHODS USED TO MAKE THE ARRAYS CAN ALSO BE TURNED INTO INT TO RETURN THE ARRAY VALUES SO THE ARRAY WILL REFLECT
	THE REMOVAL OR ADDITION OF ELEMENTS. OTHER IMPROVEMENTS CAN ALSO BE DONE  BUT WAS NOT DONE DUE TO TIME RESTRICTIONS AND CONFLICTING
	PROJECTS. THANK YOU.
	*/
}