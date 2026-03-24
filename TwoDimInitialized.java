public class TwoDimInitialized {
  public static void main(String[] args) {

    int[][] table = {
      {  1,  2,  3,  4 },
      {  5,  6,  7,  8 },
      {  9, 10, 11, 12 }
    };

    int sum = 0;
    for (int row = 0; row < table.length; row++)
      for (int col = 0; col < table[row].length; col++)
        sum += table[row][col];

    System.out.println("Sum: " + sum);
    System.out.println("Rows: " + table.length);
    System.out.println("Cols: " + table[0].length);
  }
}