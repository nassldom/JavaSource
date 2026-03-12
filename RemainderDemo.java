import java.math.BigInteger;
import java.util.Scanner;

class RemainderDemo
{

  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    String input;
    BigInteger a, divisor, q, r;
    
    System.out.print("a: ");
    input = scan.next();
    a = new BigInteger( input.trim() );
    
    System.out.print("divisor: ");
    input = scan.next();
    divisor = new BigInteger( input.trim() );
  
    q = a.divide( divisor );
    r = a.remainder( divisor );
    
    System.out.println( a + " divide    " + divisor + " == " + q);
    System.out.println( a + " remainder " + divisor + " == " + r);
    System.out.println( q + " multiply  " + divisor +  " add " + r + " == " 
        + (q.multiply(divisor)).add(r) );
  }
}