class Calculate
{
    public int Triangle( int N )
    {
        if ( N == 1 )
            return 1;
        else
            return N + Triangle( N-1 );
    }

    public int Pyramid( int N )
    {
        if ( N == 1 )
            return 1;
        else
            return Pyramid ( N - 1 ) + Triangle( N );
    }
}

public class PyramidTester
{
    public static void main( String[] args )
    {
        int argument = Integer.parseInt( args[0] );

        Calculate c = new Calculate();
        int result = c.Pyramid( argument );
        System.out.println( "Pyramid( " + argument + " ) is " + result );
    }
    
}
