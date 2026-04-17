public class SheepHerdSize {
    public static void main(String[] args) {
        double N;
        int t;

        double power = 1.0; // 0.83^0 = 1

        System.out.println("Year\tSheep count");
        for (t = 0; t <= 25; t++) {
            N = 220.0 / (1.0 + 10.0 * power);
            System.out.printf(" %d\t%.2f%n", t, N);

            if (N >= 80.0 && t > 0) {
                System.out.println("They must be supervised for " + t + " years.");
            }

            power = power * 0.83; // next power of 0.83
        }
    }
}