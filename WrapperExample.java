import java.util.* ;
public class WrapperExample
{
  public static void main ( String[] args)
  {
    ArrayList<Integer> data = new ArrayList<Integer>();

    data.add( 1 );  // add an Integer object containing 1
    data.add( 3 );
    data.add( 17 );
    data.add( 29 );

    for ( Integer val : data )
      System.out.print( val + " " );

    System.out.println( );
  }
}