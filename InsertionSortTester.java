public class InsertionSortTester
{
 
  // Sort the list
  //
   public static void insertionSort (int[] list)
   {
      //  For each unsorted integer
      for (int j = 1; j < list.length; j++)
      {

         //  Keep swapping with its left neighbor 
         //  until it is larger or equal to left neighbor
         int k = j;
         while (k > 0 && list[k-1] > list[k] )
         {
            int temp  = list[k-1];
            list[k-1] = list[k];
            list[k]   = temp;
            k--;
         }
      }
   }
  
  public static void main ( String[] args )
  {
    int[] values = { 23, 12, 4, 56, 10, 34, 9, 14, 4, 21, -9, 34, 78, 2, 5, 8 };
    
    // print out the array
    System.out.println("Before: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
    System.out.println( );
    
    // sort the array
    insertionSort( values );
  
    // print out the array
    System.out.println("\nAfter: "); 
    for ( int val : values )
      System.out.print( val + ", " ); 
    System.out.println( );
 
   }
}