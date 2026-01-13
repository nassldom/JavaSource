public class  MillionDollarBuggy
{

	public static void main( String[] args ) 
	{
		double initialAmount = 1000.00;
		double dollars = 0.0;
    		double rate;
		int year;

		rate = 0.0;		// Start interest rate at zero
	
 
		while ( dollars < 1000000 )
		{

// compute the dollars after 40 years at the current rate
       
			year = 1;
			dollars = initialAmount;
			while (year <= 40)
			{
        			dollars = dollars + dollars*rate  ; // add another year's interest     
         			dollars = dollars + 1000 ;          // add in this year's contribution
         			year    =  year + 1 ;
			}

// change to the next rate 

			rate = rate + 0.001;
		}
		System.out.println("After 40 years at " + rate*100 + " percent interest you will have " + dollars + " dollars");
	}
}
	
   