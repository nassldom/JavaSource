import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter X:\n");
        double x = input.nextDouble();
        
        System.out.print("Enter Y:\n");
        double y = input.nextDouble();
        
        double arithmeticMean = (x + y) / 2.0;
        double harmonicMean   = 2.0 / (1.0 / x + 1.0 / y);
        
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Harmonic   mean: " + harmonicMean);
        
        input.close();
    }
}
/*
Enter X:
12
Enter Y:
16
Arithmetic mean: 14.0
Harmonic   mean: 13.714285714285715
*/