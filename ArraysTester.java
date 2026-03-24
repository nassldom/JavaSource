import java.util.*;

public class ArraysTester
{
  
  public static void main ( String[] args )
  {
    int[] values = { 23, 12, 4, 56, 10, 34, 9, 14, 4, 21, -9, 34, 78, 2, 5, 8 };
    
    // print out the array
    System.out.println("Before: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
    
    // sort the array
    Arrays.sort( values );
  
    // print out the array
    System.out.println("\nAfter: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
    System.out.println( );
 
   }
}