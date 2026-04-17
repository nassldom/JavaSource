import java.util.Scanner;

public class BrickFall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        double seconds = input.nextDouble();
        
        double g = 32.174;
        double distance = 0.5 * g * seconds * seconds;
        
        System.out.println("Distance: " + distance);
        
        input.close();
    }
}
/*
Enter the number of seconds: 5.4
Distance: 469.09692000000007
*/