import java.awt.*;
class PointEg4
{

  public static void main ( String arg[] )
  {
    Point pt = new Point( 12, 45 );   // construct a Point
    System.out.println( pt );     

    pt.move( -13, 49 ) ;              // change the x and y in the Point
    System.out.println( pt ); 

  }
}