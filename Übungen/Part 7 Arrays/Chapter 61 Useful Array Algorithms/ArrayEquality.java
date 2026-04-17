import java.util.Arrays;

class ArrayEquality
{
  public static boolean myEquals( int[] a, int[] b )
  {
    if (a == b) return true;          // gleiche Referenz, inkl. beide null
    if (a == null || b == null) return false;
    if (a.length != b.length) return false;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) return false;
    }
    return true;
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays.equals says: ");
    if ( Arrays.equals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ");
    if ( myEquals( arrayA, arrayB ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}