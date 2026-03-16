import java.io.*;
import java.util.Scanner;

public class AddUpAll
{
  public static void main ( String[] args ) throws IOException
  {
    int value;             // the value of the current integer
    int limit;             // the number of integers to add up
    int sum = 0;           // initialize sum
    
    // Prompt for and open the input file   
    Scanner user = new Scanner( System.in );
    System.out.print("File name? ");
    String fileName = user.next().trim();
    Scanner scan = new Scanner( new File(fileName) );

    // get the number of integers to add up
    System.out.println("Enter how many integers:");
    limit = scan.nextInt();
    int count = 0;         // initialize count

    while ( count < limit )
    {
      System.out.print("Enter a number: ");
      value  = scan.nextInt();
      count  = count + 1;     // increment count
      sum    = sum + value;   // add to the sum
    }

    System.out.println( "Grand Total: " + sum );
    scan.close();
  }
}