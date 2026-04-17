import java.util.Scanner;

public class PascalTester {
    public static int tri(int row, int col) {
        if (col == 0) return 1;
        if (row == col) return 1;

        return tri(row - 1, col - 1) + tri(row - 1, col);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Row: ");
        int row = scan.nextInt();
        System.out.print("Column: ");
        int col = scan.nextInt();

        if (row < 0 || col < 0 || col > row) {
            System.out.println("Invalid row/column.");
        } else {
            System.out.println("tri(" + row + ", " + col + ") = " + tri(row, col));
        }
    }
}