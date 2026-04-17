public class SineTable {
    public static void main(String[] args) {
        System.out.println("angle      sine");
        System.out.println("-----    --------");
        
        for (int angle = -90; angle <= 90; angle += 15) {
            double radians = angle * Math.PI / 180.0;
            double sin = Math.sin(radians);
            
            // Spezialfall 0.0, um die Dezimalpunkte zu alignen
            if (angle == 0) {
                System.out.printf(" %4.1f   % .6f%n", (double) angle, sin);
            } else {
                System.out.printf("%5.1f   % .6f%n", (double) angle, sin);
            }
        }
    }
}