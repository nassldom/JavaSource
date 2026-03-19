class EqualsDemo4
{
  public static void main ( String arg[] )
  {
    Point pointA = new Point( 7, 99 );     // pointA refers to a Point Object
    Point pointB = pointA;                 // pointB refers to the same Object 

    if ( pointA.equals( pointB ) )
    {
      System.out.println( "The two variables refer to the same object," );
      System.out.println( "or different objects with equivalent data." );
    }
    else
      System.out.println( "The two variables refer to different objects" );     

  }
}