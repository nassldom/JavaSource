import java.util.Scanner;

public class DoWhileTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int input;

    // do-while: mindestens einmal ausgeführt, dann Bedingung prüfen
    do {
      System.out.print("Enter a positive number (0 to stop): ");
      input = scan.nextInt();
      sum += input;
    } while (input != 0);

    System.out.println("Sum: " + sum);
    scan.close();
  }
}