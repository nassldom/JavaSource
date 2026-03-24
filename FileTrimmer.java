// Create a new text file, a copy of the input text file
// but with white space trimmed from the beginning and
// ends of lines.

import java.util.*;
import java.io.*;

public class FileTrimmer
{
  public static void main (String[] args)  
  { 
    Scanner input = null ;
    PrintWriter output = null ;
    Scanner user = null ;
    String  inputFileName, outputFileName;
 
    // Open Files
    try
    {
      // create Scanner for user input
      user = new Scanner( System.in );
      
      // prepare the input file
      System.out.print("Input File Name: ");
      inputFileName = user.nextLine().trim();
      File file = new File( inputFileName );      
      input = new Scanner( file );      

      // prepare the output file 
      System.out.print("Output File Name: ");
      outputFileName = user.nextLine().trim();
      output = new PrintWriter( outputFileName );  
    }
    catch ( IOException iox )
    {
      System.out.println("Problem Opening Files");
      System.out.println( iox.getMessage() );
      if ( input  != null ) input .close();
      if ( output != null ) output.close();
      user.close();
      return;
    }
    
    // processing loop
    try
    {
      // for each line of input
      while( input.hasNextLine() )    
      {
        String line = input.nextLine() ; 
        output.println( line.trim() );
      } 
    }
    catch ( Exception ex )
    {
      System.out.println("Problem with file I/O");
      System.out.println( ex.getMessage() );
    }
    finally
    {
      // close the files
      if ( input  != null ) input .close();
      if ( output != null ) output.close();
    }

    user.close();
    
  }
}