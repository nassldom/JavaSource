import java.util.Scanner;

public class LogBase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double: ");
        double x = input.nextDouble();
        
        double log2 = Math.log(x) / Math.log(2.0);
        
        System.out.println("Base 2 log of " + x + " is " + log2);
        
        input.close();
    }
}
/*
Enter a double:
998.65
Base 2 log of 998.65 is 9.963835330516641
*/