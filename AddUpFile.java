import java.util.Scanner;

class AddUpFile
{
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    int value;
    int sum = 0 ;       // initialize sum

    int count = 1 ;     // initialize count
    while ( count <= 100 )
    {
      System.out.print("Enter a number: ") ;
      value  = scan.nextInt() ;    // get next integer
      sum    = sum + value;        // add to the sum
      count  = count + 1 ;         // increment count
    }

    System.out.println( "Grand Total: " + sum );
  }
}