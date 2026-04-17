import java.util.Scanner;

public class InRangeAdder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("In-range Adder");
        System.out.print("Low end of range: ");
        int low = in.nextInt();
        System.out.print("High end of range: ");
        int high = in.nextInt();

        int inRangeSum = 0;
        int outRangeSum = 0;

        System.out.print("Enter data: ");
        int value = in.nextInt();

        while (value != 0) {
            if (value >= low && value <= high) {
                inRangeSum += value;
            } else {
                outRangeSum += value;
            }
            System.out.print("Enter data: ");
            value = in.nextInt();
        }

        System.out.println("Sum of in range values: " + inRangeSum);
        System.out.println("Sum of out of range values: " + outRangeSum);
    }
}