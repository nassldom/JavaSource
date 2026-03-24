public class SelectionSortTesterStrings
{
 
  // Sort an array of Strings
  public static void selectionSort( String[] array )
  {
    
    // Find the string  reference that should go in each cell of
    // the array, from cell 0 to the end
    for ( int j=0; j < array.length-1; j++ )
    {
      // Find min: the index of the string reference that should go into cell j.
      // Look through the unsorted string (those at j or higher)
      int min = j;
      for ( int k=j+1; k < array.length; k++ )
        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

      // Swap the reference at j with the reference at min 
      String temp = array[j];
      array[j] = array[min];
      array[min] = temp;
    }
  
  }
  
  public static void main ( String[] args )
  {
    String[] strArray = { "bat", "ant", "dog", "cat", "eel", "ibx", "fox", "gnu", "cow", "pig" };
    
    // print out the array
    System.out.println("Before: "); 
    for ( String str : strArray )
      System.out.print( str + ", " ); 
    System.out.println( );
    
    // sort the array
    selectionSort( strArray );
  
    // print out the array
    System.out.println("After: "); 
    for ( String str : strArray )
      System.out.print( str + ", " ); 
    System.out.println( );
 
   }
}