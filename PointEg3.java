
class PointEg3
{

  public static void main ( String arg[] )
  {
    Point a = new Point();              // declarations and construction combined
    Point b = new Point( 12, 45 );
    Point c = new Point( b );

    System.out.println( a ); // create a temporary String based on "a", print it out
    System.out.println( b ); // create a temporary String based on "b", print it out
    System.out.println( c ); // create a temporary String based on "c", print it out
  }
}