class Weight
{
  private int[] data;
  
  public Weight(int[] init)
  {
    data = new int[init.length];
    
    for (int j = 0; j < init.length; j++)
    {
      data[j] = init[j];
    }
  }
  
  public String toString()
  {
    String result = "";

    for (int j = 0; j < data.length; j++)
    {
      result = result + data[j] + " ";
    }

    return result;
  }

  public int average()
  {
    int sum = 0;

    for (int j = 0; j < data.length; j++)
    {
      sum = sum + data[j];
    }

    return sum / data.length;
  }

  public int subAverage(int start, int end)
  {
    int sum = 0;

    for (int j = start; j <= end; j++)
    {
      sum = sum + data[j];
    }

    return sum / (end - start + 1);
  }
}

public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

    Weight june = new Weight(values);

    int mid = values.length / 2;

    int firstHalf = june.subAverage(0, mid);
    int secondHalf = june.subAverage(mid, values.length - 1);

    System.out.println("first half average  = " + firstHalf);
    System.out.println("second half average = " + secondHalf);
    System.out.println("difference          = " + (firstHalf - secondHalf));
  }
}