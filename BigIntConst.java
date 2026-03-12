import java.math.BigInteger;

public class BigIntConst 
{
    public static void main(String[] args) 
    {
        BigInteger a = new BigInteger( "45" );

        BigInteger c = a.add( BigInteger.TEN );
        c = c.subtract( BigInteger.ZERO );

        System.out.println("Result: " + c );
        
    }
    
}
