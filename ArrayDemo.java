public class ArrayDemo
{
  public static void main ( String[] args ) 
  {
    int[]    arI =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    double[] arF =  { 2.1, -4.0, 13.2, 21.95, -6.3, 3.28, 6.0, 0.5 } ;

    System.out.println("The first  maximum is: " + ArrayOps.findMax( arI )  );
    
    System.out.println("The second maximum is: " + ArrayOps.findMax( arF )  );    
  }
}      

class ArrayOps
{
  public static int findMax( int[] x )                
  {
    int max = x[0];
    for ( int index=0; index <x.length; index++ )
      if ( x[index] > max )
        max = x[index] ;
    return max ;
  }

  public static double   findMax( double[] x  )               
  {
    double   max = x[0];
    for ( int index=0; index <x.length; index++ )
      if ( x[index] > max )
        max = x[index] ;
    return max ;
  }
}