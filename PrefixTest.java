class PrefixTest
{
  public static void main ( String args[] )
  {
     String burns = "My love is like a red, red rose.";

     if ( burns.startsWith( "My love" ) )
       System.out.println( "Prefix 1 matches." );
     else
       System.out.println( "Prefix 1 fails." );

     if ( burns.startsWith( "my love" ) )
       System.out.println( "Prefix 2 matches." );
     else
       System.out.println( "Prefix 2 fails." );

     if ( burns.startsWith( "  My love" ) )
       System.out.println( "Prefix 3 matches." );
     else
       System.out.println( "Prefix 3 fails." );

     if ( burns.startsWith( "  My love".trim() ) )
       System.out.println( "Prefix 4 matches." );
     else
       System.out.println( "Prefix 4 fails." );
  }
}