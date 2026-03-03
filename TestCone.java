import java.util.Scanner;                                       // file: TestCone.java (other Cone.java)
import java.util.Locale;
public class TestCone 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US); // für die Eingabe von Kommazahlen mit Punkt statt Komma
        
        double radius, height;

        System.out.print("Enter the radius of the cone: ");
        radius = scan.nextDouble();

        System.out.print("Enter the height of the cone: ");
        height = scan.nextDouble();

        Cone cone = new Cone(radius, height);

        System.out.println("Area " + cone.area() + " Volume " + cone.volume());
    }   
}
