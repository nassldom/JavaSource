import java.util.Random;
import java.util.Scanner;

public class MedianAverageTester {

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

    public static double average(int[] list) {
        long sum = 0;
        for (int value : list) {
            sum += value;
        }
        return (double) sum / list.length;
    }

    public static double median(int[] list) {
        int n = list.length;

        if (n % 2 == 1) {
            return list[n / 2];
        } else {
            return (list[n / 2 - 1] + list[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("size of the array -->");
        int size = scan.nextInt();

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            if (i % 10 == 0) {
                values[i] = 10000 + rand.nextInt(90001);
            } else {
                values[i] = rand.nextInt(10001);
            }
        }

        insertionSort(values);

        System.out.println("Average = " + average(values));
        System.out.println("Median  = " + median(values));
    }
}