import java.util.Scanner;

public class SubstringFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string:\n");
        String original = input.nextLine();
        
        System.out.print("Enter beginning index: ");
        int beginIndex = input.nextInt();
        
        System.out.print("Enter ending index: ");
        int endIndex = input.nextInt();
        
        String sub = original.substring(beginIndex, endIndex);
        
        System.out.println("\nOriginal string:\n" + original);
        System.out.println("\nSubstring:\n" + sub);
        
        input.close();
    }
}
/*
Enter a string:
Eva, can I stab bats in a cave?
Enter beginning index: 5
Enter ending index: 20

Original string:
Eva, can I stab bats in a cave?

Substring:
can I stab bats
*/