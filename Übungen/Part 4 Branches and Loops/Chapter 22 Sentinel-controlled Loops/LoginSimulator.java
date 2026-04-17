import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("User Name: ");
            String user = in.next();
            System.out.print("Password : ");
            String pass = in.next();

            if (user.equals("quit") && pass.equals("exit")) {
                System.out.println("System shutting down.");
                System.out.println("Bye.");
                break;
            } else if (user.equals("joy") && pass.equals("sun")) {
                System.out.println("You have logged on with priority 4");
            } else if (user.equals("gates") && pass.equals("monopoly")) {
                System.out.println("You have logged on with priority 1");
            } else if (user.equals("jobs") && pass.equals("apple")) {
                System.out.println("You have logged on with priority 3");
            } else if (user.equals("root") && pass.equals("secret")) {
                System.out.println("You have logged on with priority 5");
            } else {
                System.out.println("Logon failed");
            }
        }
    }
}