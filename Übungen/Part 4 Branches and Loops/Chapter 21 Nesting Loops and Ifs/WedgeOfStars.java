import java.util.Scanner;

public class WedgeOfStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Initial number of stars: ");
        int n = in.nextInt();

        for (int row = n; row >= 1; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}