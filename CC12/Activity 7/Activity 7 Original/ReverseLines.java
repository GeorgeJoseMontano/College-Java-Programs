/*
Montano, George Jose P.
20190018801

CC 12 B
Activity 7

Problem: Make a program that reads from a file (args[0]), output to a file (args[1])
output in reverse order of lines.

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
		 
			ArrayList<String> arrayList = new ArrayList<String>(); //create an arraylist
			String str = "";
			
			while ((str = br.readLine()) !=null) 
			{
				arrayList.add(str);//insert the lines of string into arraylist
			}
			
			String lines[] = new String[arrayList.size()];//create an array
		  
			for (int j = (lines.length - 1); j >= 0; j--) 
			{
				lines[j] = (String)arrayList.get(arrayList.size()-(j+1)); //move lines of string to array in reverse order
			}
			
			for (int j = 0;j < lines.length;j++) 
			{
			  bw.write(lines[j] + "\n"); //print lines from array
			  bw.newLine();
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