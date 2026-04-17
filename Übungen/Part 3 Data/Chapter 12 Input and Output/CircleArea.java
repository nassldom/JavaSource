import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the radius: ");
        int radius = input.nextInt();
        
        double area = Math.PI * radius * radius;
        
        System.out.println("The radius is: " + radius + " The area is: " + area);
        
        input.close();
    }
}