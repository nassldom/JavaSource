import java.util.*;

public class TwoDieToss {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Press Enter to toss, type 'quit' to exit.");

    while (true) {
      String input = scan.nextLine();

      if (input.equals("quit")) {
        break;
      }

      System.out.println("You toss a " + (rand.nextInt(6) + 1 + rand.nextInt(6) + 1));
    }

    scan.close();
  }
}
