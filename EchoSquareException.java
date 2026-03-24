import java.util.*;
import java.io.*;

public class EchoSquareException
{
  public static void main (String[] args)
  { 
    int num, square;
    Scanner scan = null;
    
    try 
    {
      File file = new File("myData.txt"); // create a File object
      scan = new Scanner( file );      // connect a Scanner to the file

      num = scan.nextInt();  // read and convert the first token
      square = num * num ;   
      System.out.println("The square of " + num + " is " + square);
    }
    catch ( IOException iox ) 
    {
      System.out.println("Error opening the file");
    }
    catch ( InputMismatchException imx ) 
    {
      System.out.println("Bad data in the file");
    }

    if ( scan != null ) scan.close();
    System.out.println("Good-bye");
  }
}