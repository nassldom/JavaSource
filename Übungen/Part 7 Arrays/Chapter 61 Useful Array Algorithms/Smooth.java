class Smooth
{
  public static void main ( String[] args )  
  {
    int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
    int[] smooth  = new int[signal.length];
    
    // first element: average of first two
    smooth[0] = (signal[0] + signal[1]) / 2;
    
    // last element: average of last two
    smooth[signal.length - 1] =
        (signal[signal.length - 2] + signal[signal.length - 1]) / 2;
    
    // middle elements: average of neighbors
    for (int i = 1; i < signal.length - 1; i++) {
      smooth[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
    }
      
    // write out the input
    System.out.print("signal: ");
    for (int j = 0; j < signal.length; j++) {
      System.out.print(signal[j] + " ");
    }
    System.out.println();
    
    // write out the result
    System.out.print("smooth: ");
    for (int j = 0; j < smooth.length; j++) {
      System.out.print(smooth[j] + " ");
    }
    System.out.println();
  }
}