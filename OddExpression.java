import java.math.BigInteger;

class OddExpression
{

  public static void main ( String[] args )
  {
    BigInteger a = new BigInteger( "34" );
    BigInteger b = new BigInteger( "-3" );
    BigInteger c = new BigInteger( "23" );
    BigInteger d = new BigInteger( "5" );
    
    BigInteger r = a.multiply( b.add(c) ).add( d );

    System.out.println("Result: " + r);
  }
}
