class Searcher
{
  // seek target in the array of strings.
  // return the index where found, or -1 if not found.
  public static int search( String[] array, String target )
  {
     for ( int j=0; j  < array.length; j++ )
       if ( array[j] != null )
         if ( array[j].equals( target ) ) return j ; // Target found.

     return -1 ; // Target not found 
  }
}

public class SearchTester
{
  public static void main ( String[] args )
  {
    final int theSize = 20 ;

    String[] strArray = new String[ theSize ] ;  

    strArray[0] = "Boston" ;
    strArray[1] = "Albany" ;
    strArray[2] = "Detroit" ;
    strArray[3] = "Phoenix" ;
    strArray[4] = "Peoria" ;
    strArray[6] = "Albany" ;
    strArray[7] = "Houston" ;
    strArray[8] = "Hartford" ;

    // print out only those cells with data
    for (int j=0; j  < strArray.length; j++ )
      if ( strArray[j] != null )
        System.out.println( j + ": " + strArray[j] );

    // search for "Peoria"
    int where = Searcher.search( strArray, "Peoria" ); 
    if ( where >= 0 )
      System.out.println("Target found in cell " + where );
    else
      System.out.println("Target not found" );

  }
}