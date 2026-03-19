public class EqualsICTester
{
  public static boolean equalsIC( String strA, String strB )
  {
    if ( strA.isEmpty() && strB.isEmpty() ) 
      return true;
    else if ( strA.isEmpty() || strB.isEmpty() ) 
      return false;
    else if ( Character.toLowerCase( strA.charAt(0) ) != Character.toLowerCase( strB.charAt(0) ) )
      return false;
    else
      return equalsIC( strA.substring(1), strB.substring(1));
  }
   
  public static void main (String[] args)
  {
    String strA = "Applecart";
    String strB = "appleCarT";
    
    if ( equalsIC( strA, strB ) )
      System.out.println(  "\"" + strA + "\" equal \"" + strB  + "\"");
    else
      System.out.println(  "\"" + strA + "\" not equal \"" + strB  + "\"");
    
  }
}