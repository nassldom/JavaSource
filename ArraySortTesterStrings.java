import java.util.*;

public class ArraySortTesterStrings
{
   public static void main ( String[] args )
  {
    String[] strArray = { "bat", "ant", "dog", "cat", "eel", "ibx", "fox", "gnu", "cow", "pig" };
    
    // print out the array
    System.out.println("Before: "); 
    for ( String str : strArray )
      System.out.print( str + ", " ); 
    System.out.println( );
    
    // sort the array
    Arrays.sort( strArray );
  
    // print out the array
    System.out.println("After: "); 
    for ( String str : strArray )
      System.out.print( str + ", " ); 
    System.out.println( );
 
   }
}