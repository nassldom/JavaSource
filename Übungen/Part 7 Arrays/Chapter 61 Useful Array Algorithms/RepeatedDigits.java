import java.util.Scanner;

class RepeatedDigits
{
  public static boolean repeatedDigits(long val) {
    boolean[] seen = new boolean[10];

    while (val > 0) {
      int digit = (int)(val % 10);
      if (seen[digit]) {
        return true; // bereits gesehen
      }
      seen[digit] = true;
      val /= 10;
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive integer (0 to quit): ");
    long n = scan.nextLong();

    while (n > 0) {
      if (repeatedDigits(n))
        System.out.println(n + " has repeated digits");
      else
        System.out.println(n + " has no repeated digits");

      System.out.print("Enter a positive integer (0 to quit): ");
      n = scan.nextLong();
    }
  }
}