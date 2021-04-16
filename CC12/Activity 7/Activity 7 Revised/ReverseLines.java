/*
Montano, George Jose P.
20190018801

CC 12 B
Activity 7
Version: 2.0

Problem: Make a program that reads from a file (args[0]), output to a file (args[1])
output in reverse order of lines.

Revisions: Replaced ArrayList with Stacks
*/

import java.io.*;

public class ReverseLines 
{ 
	public static void main(String[] args) //can put throws IOException here
	{ 
		String inputFile = args[0];
		String outputFile = args[1];
	   
		try 
		{
			FileReader file_reader = new FileReader(inputFile);
			FileWriter file_writer = new FileWriter(outputFile);
			
			BufferedReader br = new BufferedReader(file_reader);
			BufferedWriter bw = new BufferedWriter(file_writer);
		 
			OurListStack stack = new OurListStack(); //create a new stack
			String str = "";
			int ctr = 0;
			
			while ((str = br.readLine()) !=null) 
			{
				stack.push(str);//push the lines of string into stack
				ctr++;
			}
		  
			for (int j = 0;j < ctr;j++) 
			{
			  bw.write(stack.pop()); //print lines that were returned by the pop
			  bw.newLine();//create a new line
			}
			
			bw.flush();
			br.close();
			bw.close();
			System.out.println("Writing Successful");
			
		} catch(Exception e) {
          System.out.print("An exception occured!");
      }
	}
}