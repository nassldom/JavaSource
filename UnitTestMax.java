public class UnitTestMax
{
   
  public static int maxTwo( int X, int Y)
  {
    if ( X > Y )
      return X;
    else
      return Y;
  }

  public static int maxFour( int A, int B, int C, int D)
  {
    int maxAB = maxTwo( A, B );
    int maxCD = maxTwo( C, D );
    return maxTwo( maxAB, maxCD );
  }

  public static int maxEight( int A, int B, int C, int D,
      int E, int F, int G, int H)
  {
    int maxABCD = maxFour( A, B, C, D );
    int maxEFGH = maxFour( E, F, G, H );
    return maxTwo( maxABCD, maxEFGH );
  }
  
  public static void main (String[] args ) 
  {
    int A=  1, B= 3, C=  4, D= 30;
    int E= 45, F= 7, G= 21, H=  7;
    System.out.println("The max of " 
      + A + ", " + B + ", " + C + ", " + D + ", "
      + E + ", " + F + ", " + G + ", " + H   
      + " is: " + 
      maxEight( A, B, C, D, E, F, G, H) );
  }
}