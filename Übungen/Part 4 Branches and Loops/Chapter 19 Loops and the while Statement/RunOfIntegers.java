import java.util.Scanner;

public class RunOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = in.nextInt();
        System.out.print("Enter End: ");
        int end   = in.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}