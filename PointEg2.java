
class PointEg2
{

  public static void main ( String arg[] )
  {
    Point a, b, c;              // reference variables

    a = new Point();            // create a Point at ( 0,  0); 
                                // save the reference in "a"
    b = new Point( 12, 45 );    // create a Point at (12, 45); 
                                // save the reference in "b"
    c = new Point( b );         // create a Point

    String strA = a.toString(); // create a String object based on the data
                                // found in the object referenced by "a".
    System.out.println( strA );

    System.out.println(a.toString());
    System.out.println(b.toString());  // b benutzt
    System.out.println(c.toString());  // c benutzt
  }
}