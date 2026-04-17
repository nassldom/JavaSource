import java.util.Arrays;

class ArraySameElements
{
  public static boolean sameElts( int[] a, int[] b )
  {
    if (a == b) return true;
    if (a == null || b == null) return false;
    if (a.length != b.length) return false;

    int[] copyA = Arrays.copyOf(a, a.length);
    int[] copyB = Arrays.copyOf(b, b.length);

    Arrays.sort(copyA);
    Arrays.sort(copyB);

    return Arrays.equals(copyA, copyB);
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts( arrayA, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
  }
}