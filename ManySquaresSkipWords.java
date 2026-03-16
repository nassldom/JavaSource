import java.util.Scanner;
import java.io.*;

public class ManySquaresSkipWords
{
  public static void main (String[] args) throws IOException
  { 
    File    file = new File("myData.txt");   // create a File object
    Scanner scan = new Scanner( file );      // connect a Scanner to the file
    int num, square;      

    while ( scan.hasNext() )   // more data to process?  this does not consume the token
    {
      if ( scan.hasNextInt() )  // Is it an integer? this does not consume the token
      {
        num = scan.nextInt();   // read the token and return an integer
        square = num * num ;      
        System.out.println("The square of " + num + " is " + square);
      }
      else
        scan.next();   // read and discard the non-integer
    }
    scan.close();
  }
}