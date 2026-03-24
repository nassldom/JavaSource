public class MultiplicationTable {
  public static void main(String[] args) {

    int size = 10;
    int[][] multTable = new int[size][size];

    for (int row = 0; row < size; row++)
      for (int col = 0; col < size; col++)
        multTable[row][col] = (row + 1) * (col + 1);

    System.out.println("Multiplication Table (1-10):");
    System.out.print("    ");
    for (int i = 1; i <= size; i++)
      System.out.printf("%4d", i);
    System.out.println();
    System.out.println("    " + "----".repeat(size));

    for (int row = 0; row < size; row++) {
      System.out.printf("%3d|", row + 1);
      for (int col = 0; col < size; col++)
        System.out.printf("%4d", multTable[row][col]);
      System.out.println();
    }
  }
}