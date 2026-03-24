import java.util.*;

public class ArraySortTester
{
  public static void main ( String[] args )
  {
    int[] values = { 17, 5, 21, 8, 19, 2, 23, 15, 4, 13 };
    
    // print out the array
    System.out.println("initial values: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
     
    // sort the array
    Arrays.sort( values );  // NOTE
  
    // print out the array
    System.out.println("\n\nsorted values: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
    System.out.println( );
   }
}