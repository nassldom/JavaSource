public class ArrayEg5
{
  public static void main ( String[] args )
  {
    int[] valA = { 12, 23, 45, 56 };

    double[] valB = new double[6];

    valB[ 0 ]  = valA[ 2 ] ;
    valB[ 3 ]  = valA[ 2 ] ;
    valB[ 1 ]  = valA[ 1 ] ;
    valB[ 5 ]  = valA[ 0 ] ;
    
    System.out.println( "valB:" + valB[0] + ", " 
      + valB[1] + ", " + valB[2] + ", "  + valB[3] 
      + ", " + valB[4] + ", " + valB[5]  );
   }
}
