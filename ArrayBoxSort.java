import java.util.*;

public class ArrayBoxSort
{
 
  public static void main ( String[] args )
  {
    Box[] boxArray = 
      { new Box( 1.0, 2.3, 2.7),  new Box( 1.0, 4.9, 3.2), new Box( 3.0, 1.3, 2.7),
        new Box( 3.0, 0.1, 4.67), new Box( 1.3, 1.3, 1.3), new Box( 4.0, 2.3, 1.7),
        new Box( 2.2, 2.1, 1.67), new Box( 2.3, 7.3, 6.3), new Box( 2.0, 3.3, 5.3) 
      };
    
    // print out the array
    System.out.println("Before: "); 
    for ( Box box : boxArray )
      System.out.println( box ); 
    System.out.println( );
    
    // sort the array
    Arrays.sort( boxArray );
  
    // print out the array
    System.out.println("After: "); 
    for ( Box box : boxArray )
      System.out.println( box ); 
    System.out.println( );
 
   }
}