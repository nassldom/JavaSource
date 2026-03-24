class SumArray
{

  public static void main ( String[] args ) 
  {
    double[] array =  { -47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42 } ;

    // declare and initialize the total
    double    total = 0.0 ;

    // add each element of the array to the total
    for ( int index=0; index < array.length; index++ )
    { 
      total =  total + array[ index ]  ;

    }
      
    System.out.println("The total is: " + total );
  }
}      