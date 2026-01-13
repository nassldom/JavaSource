public class MillionDollarYears
{
  public static void main( String[] args )
  {
    double dollars = 1000.00 ;
    int    year = 0;     

    while ( dollars < 1000000.00 )
    {
      // add another year's interest
      dollars =  dollars + dollars*0.05 ; 

      // add in this year's contribution
      dollars = dollars + 1000 ;

      year    =  year + 1 ;
    }

    System.out.println("It took " + year + " years to reach your goal.");
  }

}