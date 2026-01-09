import java.util.Locale;

public class LocaleDemo
{
  public static void main ( String[] args )
  {
    int value = 123456789 ;
    
    System.out.println( "Default Locale = " + Locale.getDefault() );
    System.out.printf( "value = %,12d%n", value );
  }
}