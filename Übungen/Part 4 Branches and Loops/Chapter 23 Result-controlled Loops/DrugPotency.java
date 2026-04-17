public class DrugPotency {
    public static void main(String[] args) {
        double effectiveness = 100.0; // 100%
        int month = 0;

        while (effectiveness >= 50.0) {
            System.out.println("month: " + month +
                "        effectiveness: " + effectiveness);
            effectiveness = effectiveness * 0.96; // loses 4%
            month++;
        }

        System.out.println("month: " + month +
            "        effectiveness: " + effectiveness + " DISCARDED");
    }
}