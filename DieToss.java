import java.util.Scanner;
import java.util.Random;

public class DieToss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Press Enter to toss, type 'quit' to exit.");

        while (true) {
            String line = scan.nextLine();  // wartet auf Enter
            
            if (line.equals("quit")) {
                break;  // Schleife verlassen
            }
            
            System.out.println("You toss a " + (rand.nextInt(6) + 1));
        }

        scan.close();  // jetzt erreichbar
    }
}
