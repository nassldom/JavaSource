import java.math.BigInteger;
import java.util.Scanner;

class PrimeTester
{

  public static Boolean isPrime( BigInteger N )
  {
    BigInteger trial;
    
    trial = new BigInteger( "2" );
    while ( trial.compareTo( N ) < 0 )
    {
      if ( N.remainder(trial).equals( BigInteger.ZERO ) )
        return false;
      trial = trial.add( BigInteger.ONE );
    } 
    return true;    
  }

  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    String input;
    BigInteger suspect;
    
    System.out.print("Suspected Prime: ");
    input = scan.next();
    suspect = new BigInteger( input.trim() );
    
    if ( isPrime( suspect ) )
      System.out.println("This is a prime" );
    else      
      System.out.println("This is a composite" );

    scan.close();
  }

}