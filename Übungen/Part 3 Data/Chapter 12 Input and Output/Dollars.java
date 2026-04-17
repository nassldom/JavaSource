import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the cents:\n");
        int cents = input.nextInt();
        
        int dollars = cents / 100;      // Ganzzahldivision
        int remainingCents = cents % 100;  // Restoperator
        
        System.out.println("That is " + dollars + " dollars and " + remainingCents + " cents.");
        
        input.close();
    }
}
/*
| Eingabe (cents) | dollars = cents / 100 | cents % 100 | Ausgabe                 |
| --------------- | --------------------- | ----------- | ----------------------- |
| 324             | 3                     | 24          | 3 dollars and 24 cents  |
| 1050            | 10                    | 50          | 10 dollars and 50 cents |
| 7               | 0                     | 7           | 0 dollars and 7 cents   |
| 100             | 1                     | 0           | 1 dollars and 0 cents   |
*/