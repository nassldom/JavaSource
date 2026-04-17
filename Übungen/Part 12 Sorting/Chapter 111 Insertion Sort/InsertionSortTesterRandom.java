import java.util.Random;
import java.util.Scanner;

public class InsertionSortTesterRandom {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i;

            while (j > 0 && list[j - 1] > temp) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = temp;
        }
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
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
            values[i] = rand.nextInt(10000);
        }

        System.out.println("Before:" + (isSorted(values) ? "SORTED" : "NOT sorted"));

        long startTime = System.currentTimeMillis();
        insertionSort(values);
        long endTime = System.currentTimeMillis();

        System.out.println("After:" + (isSorted(values) ? "SORTED" : "NOT sorted"));
        System.out.println("First sort time: " + (endTime - startTime) + " ms");

        long startTime2 = System.currentTimeMillis();
        insertionSort(values);
        long endTime2 = System.currentTimeMillis();

        System.out.println("Second sort time: " + (endTime2 - startTime2) + " ms");
    }
}