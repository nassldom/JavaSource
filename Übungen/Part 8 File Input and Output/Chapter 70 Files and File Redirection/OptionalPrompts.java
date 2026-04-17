import java.util.Scanner;

public class OptionalPrompts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = scan.nextLine();
        boolean doPrompt = answer.equals("yes");

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if (doPrompt) {
                System.out.print("Enter integer: ");
            }

            int value = scan.nextInt();
            sum = sum + value;
        }

        System.out.println("Sum = " + sum);
    }
}