import java.util.Random;

public class SineTester
{
  public static void main ( String[] args )
  {
    int j=0;
    Random rand = new Random();
    
    System.out.println(" x " + "\t\t\t sin(x)");
    while ( j<10 )
    {
      double x = rand.nextDouble()*(20*Math.PI) - 10*Math.PI;
      System.out.println("" + x + "\t" + Math.sin(x));
      j = j+1;
    }
  }
}  