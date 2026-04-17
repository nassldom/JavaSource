import java.util.Scanner;

public class GroupAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String currentGroup = null;
        int sum = 0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();

            if (line.length() == 0) {
                continue;
            }

            try {
                int value = Integer.parseInt(line);
                sum += value;
            } catch (NumberFormatException e) {
                if (currentGroup != null) {
                    System.out.println(currentGroup);
                    System.out.println("Sum = " + sum);
                    System.out.println();
                }

                currentGroup = line;
                sum = 0;
            }
        }

        if (currentGroup != null) {
            System.out.println(currentGroup);
            System.out.println("Sum = " + sum);
        }
    }
}