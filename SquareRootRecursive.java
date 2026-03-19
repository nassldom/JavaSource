class  SquareRootRecursive
{
  public static boolean nearlyEquals( double x, double y )
  {
    final double smallValue = 1.0E-14 ;
    return Math.abs( x - y ) < smallValue ;
  }
  
  public static double Newton( double N, double guess )
  {
    if ( nearlyEquals( guess*guess, N) )
      return guess;
    else
      return Newton( N, N/(2*guess) + guess/2 );
  }
  
  public static void main( String[] args ) 
  {
    double N     = 3.00 ;
    double guess = 1.00 ;

    System.out.println("The square root of " + N + " is " + Newton( N, guess ) ) ;
  }

}