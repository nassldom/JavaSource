import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter voltage: ");
        int voltage = input.nextInt();
        
        System.out.print("Enter resistance: ");
        int resistance = input.nextInt();
        
        double current = (voltage + 0.0) / resistance;  // Trick für double!
        
        System.out.println("Current: " + current + " amps");
        
        input.close();
    }
}