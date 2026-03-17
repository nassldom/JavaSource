import java.util.Scanner;

public class Circumference 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in );

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of the circle is: %.1fcm\n" , circumference);
        System.out.printf("The area of the circle is: %.1fcm²\n" , area);
        System.out.printf("The volume of the sphere is: %.1fcm³\n" , volume);

        scanner.close();
    }
}
