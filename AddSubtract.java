import java.math.BigInteger;

class AddSubtract
{

  public static void main ( String[] args )
  {
    BigInteger a = new BigInteger( "9" );
    BigInteger b = new BigInteger( "12" );
    BigInteger c = new BigInteger( "-20" );
    
    BigInteger d =  a.add( BigInteger.ONE ).multiply( b ).add( c );

    System.out.println("Result: " + d );
  }
}
