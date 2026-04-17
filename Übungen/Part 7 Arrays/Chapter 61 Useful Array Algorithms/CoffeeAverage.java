import java.util.Scanner;

class CoffeeAverage
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    double[] data = new double[n];

    for (int i = 0; i < n; i++) {
      data[i] = scan.nextDouble();
      System.out.println("data[ " + i + " ] = " + data[i]);
    }

    // average A1
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += data[i];
    }
    double avg = sum / n;
    System.out.println("average: " + avg);

    // find most distant value
    int indexMostDistant = 0;
    double maxDist = Math.abs(data[0] - avg);

    for (int i = 1; i < n; i++) {
      double dist = Math.abs(data[i] - avg);
      if (dist > maxDist) {
        maxDist = dist;
        indexMostDistant = i;
      }
    }

    System.out.println("most distant value: " + data[indexMostDistant]);

    // new average without that value
    sum = 0.0;
    for (int i = 0; i < n; i++) {
      if (i != indexMostDistant)
        sum += data[i];
    }
    double newAvg = sum / (n - 1);
    System.out.println("new average: " + newAvg);
  }
}