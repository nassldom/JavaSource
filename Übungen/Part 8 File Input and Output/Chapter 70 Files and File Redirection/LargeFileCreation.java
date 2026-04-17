import java.util.Scanner;
import java.util.Random;

public class LargeFileCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many integers do you want? ");
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int value = rand.nextInt(2001) - 1000;
            System.out.println(value);
        }

        System.out.println(-999);
        System.out.println(-999);
    }
}