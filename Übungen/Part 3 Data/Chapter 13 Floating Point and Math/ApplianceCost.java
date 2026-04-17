import java.util.Scanner;

public class ApplianceCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter cost per kilowatt-hour in cents: ");
        double costPerKwhCents = input.nextDouble();
        
        System.out.print("Enter kilowatt-hours used per year: ");
        double kwhPerYear = input.nextDouble();
        
        double annualCost = (costPerKwhCents / 100.0) * kwhPerYear;  // Cents → Dollar
        
        System.out.println("Annual cost: " + annualCost);
        
        input.close();
    }
}
/*
Enter cost per kilowatt-hour in cents: 8.42
Enter kilowatt-hours used per year: 653
Annual cost: 54.9826
*/