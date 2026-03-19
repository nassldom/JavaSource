class FactorialCalc 
{
    public int factorial( int N )
    {
        if ( N == 0 )
            return 1;
        else
            return N * factorial( N-1 );
    }
}

public class FactorialTester
{
    public static void main( String[] args )
    {
        int argument = 10;
        FactorialCalc f = new FactorialCalc();
        int result = f.factorial( argument );
        System.out.println( "Factorial( " + argument + " ) is " + result );
    }
}
