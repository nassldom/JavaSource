import java.util.Scanner;

public class BuckPasser
{
  public static int methodB( int divisor )  throws ArithmeticException
  {
    int result = 12 / divisor;  // may throw an ArithmeticException
    return result;
  }

  public static void methodA( String input )
  {
    int value = 0;

    try
    {
      value = Integer.parseInt( input );     // Convert the string to an int.
                                             // May throw a NumberFormatException    
    }
    catch ( NumberFormatException badData )
    {
      System.out.println( "Bad Input Data!!" );
      return;   // this is necessary; without it control will continue with the next try.
    }

    try
    {
      System.out.println( "Result is: " + methodB( value ) );
    }
    catch ( ArithmeticException zeroDiv )
    {
      System.out.println( "Division by zero!!" );
    }

  }

  public static void main ( String[] a ) 
  { 
    Scanner scan = new Scanner( System.in );
    String  inData;
    
    System.out.print("Enter the divisor: ");
    inData = scan.next();  // Read a string from standard input
    methodA( inData );     // send the string to methodA

    scan.close();
  }
}