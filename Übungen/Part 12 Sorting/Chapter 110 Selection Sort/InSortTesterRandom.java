import java.util.Random;
import java.util.Scanner;

public class InSortTesterRandom {

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

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("size of the array -->");
        int size = scan.nextInt();

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(100000);
        }

        System.out.println("Before:" + (isSorted(values) ? "SORTED" : "NOT sorted"));

        long startTime = System.currentTimeMillis();
        selectionSort(values);
        long endTime = System.currentTimeMillis();

        System.out.println("After:" + (isSorted(values) ? "SORTED" : "NOT sorted"));
        System.out.println("First sort time: " + (endTime - startTime) + " ms");

        long startTime2 = System.currentTimeMillis();
        selectionSort(values);
        long endTime2 = System.currentTimeMillis();

        System.out.println("Second sort time: " + (endTime2 - startTime2) + " ms");
    }
}