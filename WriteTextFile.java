import java.io.*;

public class WriteTextFile 
{

  public static void main ( String[] args ) 
  {
    PrintWriter output = null;
    
    try
    {
      File outFile = new File("myOutput.txt" );
      if ( outFile.exists() ) throw new IOException( "File already exists");
      
      output = new PrintWriter( outFile );
      output.println( "The world is so full"  );  
      output.println( "Of a number of things,"  );  
      output.println( "I'm sure we should all" );  
      output.println( "Be as happy as kings."  );  
    }
    catch ( IOException iox )
    {
      System.out.println( "Problem opening file:" );
      System.out.println( iox.getMessage() );
    }
    
    if ( output != null ) output.close();
  }
}