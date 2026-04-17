class ThreeSums
{
  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    int sumAll  = 0;
    int sumEven = 0;
    int sumOdd  = 0;
    
    for ( int index = 0; index < data.length; index++ )
    {
      int value = data[index];
      sumAll += value;
      if (value % 2 == 0)
        sumEven += value;
      else
        sumOdd  += value;
    }
      
    System.out.println("Sum all:  " + sumAll);
    System.out.println("Sum even: " + sumEven);
    System.out.println("Sum odd:  " + sumOdd);
  }
}