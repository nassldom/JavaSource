import java.util.*;
import java.io.*;

public class SumFileData 
{
  public static void main (String[] args) throws IOException 
  { 
    int num,sum = 0;
    Scanner scan = null, scanUser = null;
    String fileName;
    
    try 
    {
      scanUser = new Scanner( System.in );
      System.out.println("Input file name: ");
      fileName = scanUser.nextLine().trim();
      
      File file = new File( fileName ); // create a File object
      scan = new Scanner( file );      // connect a Scanner to the file

      while( scan.hasNext() )   // is there more data to process? 
      {
        num = scan.nextInt();
        sum += num;      
      }
      
      System.out.println("Sum = " + sum );
    }
    
    finally 
    {
      if ( scan != null ) scan.close();
    }

    scanUser.close();
  }
}