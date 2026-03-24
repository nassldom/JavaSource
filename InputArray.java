import java.util.Scanner ;

class InputArray
{

  public static void main ( String[] args )
  {

    int[] array = new int[5];
    int   data;

    Scanner scan = new Scanner( System.in );

    // input the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "enter an integer: " );
      data = scan.nextInt();
      array[ index ] = data ;
    }
      
    // write out the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }

    scan.close();

  }
}      