public class ReverseTester
{

  // create a new string containing the characters of the
  // input string, but reversed
  //
  public static String reverse( String data )
  {
    StringBuffer temp = new StringBuffer();

    for ( int j=data.length()-1; j >= 0; j-- )  // scan the String from right to left
      temp.append( data.charAt(j) );            // append characters on the right

    return temp.toString();      // return a String created from the StringBuffer
  }

  public static void main ( String[] args )
  {
    System.out.println( reverse( "Hello" ) );
  }
}