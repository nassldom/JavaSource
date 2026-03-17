import java.util.Scanner;

public class Hypotenuse 
{
    public static void main(String[] args) 
    {
        double leg1; // the user enters leg1
        double leg2; // the user enters leg2
        double hypotenuse; // the hypotenuse calculated from leg1 and leg2

        // get the numbers from the user
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the length of leg 1: ");
        leg1 = scan.nextDouble();
        System.out.print("Enter the length of leg 2: ");
        leg2 = scan.nextDouble();

        if (leg1 > 0.0 && leg2 > 0.0) 
        {
            hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);
            System.out.println("The length of the hypotenuse is " + hypotenuse);
        } 
        else 
        {
            System.out.println("Please enter positive numbers for the legs.");
        }
    }
    
}
