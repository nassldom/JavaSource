class Hailstone  
{
    public static void hail( long N )
    {
        System.out.print( N + ", " );
        if ( N == 1 )
            return;
        else if ( N % 2 == 0 )
            hail( N / 2 );
        else
            hail( 3 * N + 1 );
    }

    public static void main( String[] args )
    {
        long N = Long.parseLong( args[0] );
        hail( N );
    }
    
}
