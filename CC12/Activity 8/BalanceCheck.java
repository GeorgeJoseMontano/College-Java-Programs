/*
Montano, George Jose P.
20190018801

CC 12 B

Activity 8 - Balanced

	Write a program that reads a file containing n lines; the first line is an integer which indicates how 
	many lines of characters are left.

	For lines 2 to n, identify whether the sequence of parentheses, braces, and curly braces are "balanced."  

	Hint:  for open character (left delimiter), push onto stack; for close character (right delimiters), 
	pop from stack and check whether popped element matches right delimiter. You have to write your own 
	implementation of a stack. 
	
	example: when the program is run across the attached sample file (sample.txt), the output should be:

	===== sample output ===

	There are 4 lines:
	balanced
	balanced
	unbalanced
	unbalanced
*/

import java.io.*;

class BalanceCheck
{
	static boolean BracketCheck(String str)//function to check if brackets are balanced
    {
        OurListStack stack = new OurListStack(); //create a new stack using stack made in activity 6
       
        for (int i = 0; i < str.length(); i++)//traversing the string
        {
            char x = str.charAt(i);
			
			//check opening characters
            if (x == '(' || x == '[' || x == '{')
            {                
                stack.push(x);//push the element in the stack
                continue;
            }
 
			//check closing characters
            if (x == ')' || x == ']' || x == '}')
			{
				/*Note: This if-else statement allows the check to traverse through characters unrelated to the
				open-close characters - made George patent pending*/
				
				if(stack.isEmpty()) //if no opening is present in stack before a closing then it is unbalanced
				{
					return false;
				}
				else //if there is an opening statement
				{
					char check;
					switch (x)  //use a switch statement to check for each closing character's corresponding opening character
					{
					case ')':
						check = stack.pop();
						if (check == '{' || check == '[')
							return false;
						break;
		 
					case '}':
						check = stack.pop();
						if (check == '(' || check == '[')
							return false;
						break;
		 
					case ']':
						check = stack.pop();
						if (check == '(' || check == '{')
							return false;
						break;
					}
				}
			}  		
        }
        return (stack.isEmpty());//check if stack is empty return true if it is empty
    }
	
	//main driver
	public static void main(String args[])
	{
		String input_file = args[0];
		try
		{
			FileReader file_reader = new FileReader(input_file); 
			BufferedReader br = new BufferedReader(file_reader);
			
			String str = "";
			int numofLines=0;
			
			numofLines = Integer.parseInt(br.readLine()); //first line value will be the number of lines to check
			System.out.println("There are " + numofLines +" Lines");
			
			for(int i=0;i<numofLines;i++) //for loop to repeat until max number of lines is reached
			{
				if (BracketCheck(str=br.readLine())) //if method returns true value this is executed
				{
					System.out.println("Balanced ");
				}
				else
				{
					System.out.println("Unbalanced ");
				}
			}
			
			br.close();
			
		}catch(IOException e)
		{
			System.out.println("An exception occured");
		}
		
	}
}