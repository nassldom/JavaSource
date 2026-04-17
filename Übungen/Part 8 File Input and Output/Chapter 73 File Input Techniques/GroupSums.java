import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GroupSums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String fileName = console.nextLine();

        try {
            Scanner inFile = new Scanner(new File(fileName));

            int groupNumber = 0;

            while (inFile.hasNext()) {
                String token = inFile.next();

                if (token.equals("next")) {
                    groupNumber++;
                    int sum = 0;
                    boolean hasData = false;

                    while (inFile.hasNextInt()) {
                        int value = inFile.nextInt();
                        sum += value;
                        hasData = true;
                    }

                    if (hasData) {
                        System.out.println("Sum of group " + groupNumber + " is " + sum);
                    } else {
                        System.out.println("Group " + groupNumber + " contains no data");
                    }
                }
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}