// StringArray.java
//
public class StringArray
{
  public static void main ( String[] args )
  {
    String[] strArray = new String[8] ;  

    strArray[0] = "Hello" ;
    strArray[1] = "World" ;
    strArray[2] = "Greetings" ;
    strArray[3] = "Jupiter" ;
    strArray[ strArray.length-1 ] = "the end" ;

    for (int j=0; j  < strArray.length; j++ )
      if ( strArray[j] != null )
        System.out.println( "cell " + j + ": " + strArray[j] );
      else
        System.out.println( "cell " + j + ": " + "empty" );
  }
}