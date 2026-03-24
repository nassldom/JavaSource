import java.util.Scanner;

public class ConditionalOperator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scan.nextInt();

    // ?: Kurzform von if/else
    String result = (num >= 0) ? "positive or zero" : "negative";
    System.out.println(num + " is " + result);

    int absVal = (num >= 0) ? num : -num;
    System.out.println("Absolute value: " + absVal);

    scan.close();
  }
}