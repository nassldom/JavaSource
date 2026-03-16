import java.io.*;

class PrintSquare
{

  public static void main ( String[] args )  throws IOException
  {
    File file = new File( "mySquare.txt" );
    PrintWriter  output = new PrintWriter( file );

    double x = 1.7320508;

    output.println( "The square of " + x + " is " + x*x );  

    output.close();
  }
}