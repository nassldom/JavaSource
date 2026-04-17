import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tank capacity: ");
        int capacityGallons = in.nextInt();
        System.out.print("Gage reading: ");
        int gaugePercent   = in.nextInt();
        System.out.print("Miles per gallon: ");
        int milesPerGallon = in.nextInt();

        int currentGallons = capacityGallons * gaugePercent / 100;
        int rangeMiles = currentGallons * milesPerGallon;

        if (rangeMiles < 200) {
            System.out.println("Get Gas!");
        } else {
            System.out.println("Safe to Proceed");
        }
    }
}
