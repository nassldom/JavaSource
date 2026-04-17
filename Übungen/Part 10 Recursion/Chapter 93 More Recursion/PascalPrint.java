public class PascalPrint {
    public static int tri(int row, int col) {
        if (col == 0) return 1;
        if (row == col) return 1;
        return tri(row - 1, col - 1) + tri(row - 1, col);
    }

    public static void printTriangle(int rows) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c <= r; c++) {
                System.out.print(tri(r, c) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(8);
    }
}