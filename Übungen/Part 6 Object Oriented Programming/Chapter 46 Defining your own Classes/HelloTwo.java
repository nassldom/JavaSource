import java.util.Scanner;

public class HelloTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Greeting:");
        String greeting = scan.nextLine();

        HelloObject h = new HelloObject(greeting);
        System.out.println();
        h.speak();
    }
}