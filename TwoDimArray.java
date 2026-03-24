public class TwoDimArray {
  public static void main(String[] args) {

    int[][] matrix = new int[3][4]; // 3 Zeilen, 4 Spalten

    int count = 1;
    for (int row = 0; row < 3; row++)
      for (int col = 0; col < 4; col++)
        matrix[row][col] = count++;

    System.out.println("Matrix (3x4):");
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++)
        System.out.printf("%4d", matrix[row][col]);
      System.out.println();
    }
  }
}