import java.awt.*;
class EqualsDemo2
{
  public static void main ( String arg[] )
  {
    Point pointA = new Point( 7, 99 );   // first Point
    Point pointB = new Point( 7, 99 );   // second Point with equivalent data

    if ( pointA == pointB  )
      System.out.println( "The two variables refer to the same object" );   
    else
      System.out.println( "The two variables refer to different objects" );  

  }
}