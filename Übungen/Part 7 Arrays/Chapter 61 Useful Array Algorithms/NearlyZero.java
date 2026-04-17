class NearlyZero
{
  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int nearest = data[0];
    int smallestAbs = Math.abs(nearest);
    
    for (int i = 1; i < data.length; i++) {
      int val = data[i];
      int abs = Math.abs(val);
      if (abs < smallestAbs) {
        smallestAbs = abs;
        nearest = val;
      }
    }
      
    System.out.println("Element nearest to zero: " + nearest);
  }
}