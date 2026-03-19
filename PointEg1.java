
class PointEg1
{

  public static void main ( String arg[] )
  {
    Point a, b, c;              // reference variables

    a = new Point();            // create a Point at (0,  0); 
                                // save the reference in "a"
    b = new Point( 12, 45 );    // create a Point at (12, 45); 
                                // save the reference in "b"
    c = new Point( b );         // create a Point containing data equivalent
                                // to the data referenced by "b"
    System.out.println("a = (" + a.x + ", " + a.y + ")");
    System.out.println("b = (" + b.x + ", " + b.y + ")");
    System.out.println("c = (" + c.x + ", " + c.y + ")");
                            
  }
}