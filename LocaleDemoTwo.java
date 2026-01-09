import java.util.Locale;

public class LocaleDemoTwo
{
  public static void main ( String[] args )
  {
    double value = 12345.6789 ;

    System.out.printf( Locale.ITALY, "value = %,10.4f%n", value );  
  }
}