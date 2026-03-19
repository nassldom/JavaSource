import java.math.BigInteger;
import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );
        String input;
        BigInteger a, b, sum;

        System.out.println("First integer: ");
        input = scan.next();
        a = new BigInteger( input.trim());

        System.out.println("Second integer: ");
        input = scan.next();
        b = new BigInteger( input.trim());

        sum = a.add( b );

        System.out.println("Sum:             " + sum );

        scan.close();
        
    }
    
}
