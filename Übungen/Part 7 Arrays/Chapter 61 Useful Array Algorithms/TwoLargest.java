class TwoLargest
{
  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int largest    = data[0];
    int secondBest = data[0];

    for ( int index = 1; index < data.length; index++ )
    {
      int value = data[index];

      if (value > largest) {
        secondBest = largest;
        largest = value;
      } else if (value > secondBest) {
        secondBest = value;
      }
    }
      
    System.out.println("Largest: " + largest + 
                       "  Second largest: " + secondBest);
  }
}