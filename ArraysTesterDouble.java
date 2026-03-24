import java.util.*;

public class ArraysTesterDouble
{
  
  public static void main ( String[] args )
  {
    final int SIZE = 100;
    double[] values  = new double[ SIZE ];
    
    // initialize the array
    for ( int j=0; j< SIZE; j++ )
      values[j] = Math.sin( 17*j ) * Math.sin( 23*j );
    
    // print out the array
    System.out.println("Before: "); 
    for ( double val : values )
      System.out.print( val + ", " ); 
    
    // sort the array
    Arrays.sort( values );
  
    // print out the array
    System.out.println("\nAfter: "); 
    for ( double val : values )
      System.out.print( val + ", " ); 
    System.out.println( );
 
   }
}