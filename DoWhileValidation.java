import java.util.Scanner;

public class DoWhileValidation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int age;

    // Typischer Anwendungsfall: Eingabe validieren
    do {
      System.out.print("Enter your age (1-120): ");
      age = scan.nextInt();
      if (age < 1 || age > 120)
        System.out.println("Invalid! Please try again.");
    } while (age < 1 || age > 120);

    System.out.println("Valid age: " + age);
    scan.close();
  }
}