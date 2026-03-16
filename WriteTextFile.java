import java.io.*;

public class WriteTextFile 
{

  public static void main ( String[] args ) throws IOException
  {
    PrintWriter  output = new PrintWriter( "myOutput.txt" );

    output.println( "The world is so full"  );  
    output.println( "Of a number of things,"  );  
    output.println( "I'm sure we should all" );  
    output.println( "Be as happy as kings."  );  

    output.close();
  }
}