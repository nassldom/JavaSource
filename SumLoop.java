import java.math.BigInteger;

class SumLoop
{

  public static void main ( String[] args )
  {
    long count = 2000000000L  ;
    long end   = 3000000000L ;
    long sum   = 0L;
    
    while ( count <= end )
    {
      if ( count%7 != 0 )
      {
        sum += count;
      }
      count++ ;
    }
    
    System.out.println( "The sum: " + sum );
  }
}