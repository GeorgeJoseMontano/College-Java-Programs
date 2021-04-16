/*
Montano, George Jose P.
20190018801

CC 12 B
Activity 6 Input File

Make a program that reads the contents of a text file (args[0]), and output the 

    following screen:

      1. the number of lines found in the file 
      2. the number of characters per line 

    sample output 

      There are 4 lines
      line 1 has 26 characters
      line 2 has 50 characters
      line 3 has 2 characters
      line 4 has 70 characters
*/
import java.io.*;
class InputReader
{
	public static void main(String args[])
	{
		String input_file = args[0];
		try
		{
			FileReader file_reader = new FileReader(input_file); 
			BufferedReader br = new BufferedReader(file_reader);
			String str = "";
			int ctr = 1;

			while( (str = br.readLine()) != null)
			{
				ctr++;
			}
			System.out.println("There are " + ctr + " lines");
			br.close();
			
			file_reader = new FileReader(input_file); //open the file again
			br = new BufferedReader(file_reader);//open new reader
			str = "";
			ctr = 1;

			while( (str = br.readLine()) != null)
			{
				System.out.println("Line " + ctr + " has " + str.replace(" ","").length() + " characters without the spaces");
				ctr++;
			}
			br.close();
		}catch(IOException e)
		{
			System.out.println("An exception occured");
		}
		
	}
}