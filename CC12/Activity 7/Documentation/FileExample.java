/**
  * CC 12 B - Reading from a file and Writing to a file
  * reads input from a file (args[0])
  * outputs to a file (args[1])
  *   > line #: line of text
  * 22 March 2021
  */
import java.io.*;
class FileExample {

  public static void main(String args[]) {

    String input_file = args[0];
    String output_file = args[1];

      try {

        FileReader file_reader = new FileReader(input_file);
        BufferedReader br = new BufferedReader(file_reader);

        FileWriter file_writer = new FileWriter(output_file);
        BufferedWriter bw = new BufferedWriter(file_writer);

        String str = "";
        int ctr = 1;
        while( (str = br.readLine()) != null ) {

          bw.write(ctr++ + ": " + str +"hello \n");
        }

        br.close();
        bw.close();

      } catch(Exception e) {

          System.out.println("An exception occured!");
      }

  }
}