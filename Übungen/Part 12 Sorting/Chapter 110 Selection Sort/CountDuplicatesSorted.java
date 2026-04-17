import java.util.Random;
import java.util.Scanner;

public class CountDuplicatesSorted {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static int countDuplicates(int[] array) {
        int count = 0;
        int i = 1;

        while (i < array.length) {
            if (array[i] == array[i - 1]) {
                count++;

                while (i < array.length && array[i] == array[i - 1]) {
                    i++;
                }
            } else {
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("size of the array -->");
        int size = scan.nextInt();

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(1000);
        }

        selectionSort(values);

        int duplicates = countDuplicates(values);
        System.out.println("Number of different integers that appear more than once = " + duplicates);
    }
}