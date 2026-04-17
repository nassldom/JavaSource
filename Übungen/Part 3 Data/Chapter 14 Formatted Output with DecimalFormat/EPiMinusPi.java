public class EPiMinusPi {
    public static void main(String[] args) {
        double value = Math.pow(Math.E, Math.PI) - Math.PI;

        System.out.printf("e^pi - pi (2 Stellen) : %.2f%n", value);
        System.out.printf("e^pi - pi (4 Stellen) : %.4f%n", value);
        System.out.printf("e^pi - pi (8 Stellen) : %.8f%n", value);
        System.out.printf("e^pi - pi (voll)      : %s%n", value);
    }
}