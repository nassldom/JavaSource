import java.util.* ;

class TooYoungException extends Exception
{
  TooYoungException ( int age )
  {
    super( "Too Young for Insurance! Age is: " + age  );
  }
}

public class RateCalcTwo
{

  public static int calcInsurance( int birthYear ) throws TooYoungException
  {
    final int currentYear = 2020;         // hard-coded current year.  Awkward.
    int age = currentYear - birthYear;

    if ( age < 16 )
    {
      throw new TooYoungException( age );
    }
    else
    {
      int drivenYears = age - 16;
      if ( drivenYears < 4 )
        return 1000;
      else
        return 600;
    }
  }

  public static void main ( String[] args ) 
  {
    Scanner scan = new Scanner( System.in );

    try
    {
      System.out.println("Enter birth year:");
      int inData = scan.nextInt();
      System.out.println( "Your insurance is: " + calcInsurance( inData ) );
    }
    catch ( TooYoungException oops )
    {
      System.out.println( oops.getMessage() );
    }
    catch ( Exception oops )
    {
      System.out.println( oops.getMessage() );
    }
scan.close();
  }
}