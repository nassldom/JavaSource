import java.util.Random;

public class SeedlingSurvival {
    public static void main(String[] args) {
        Random rand = new Random();
        int totalSurvived = 0;
        int seasons = 100;

        for (int s = 0; s < seasons; s++) {
            int survived = 0;
            for (int p = 0; p < 10; p++) {
                int die = rand.nextInt(10) + 1; // 1..10
                if (die <= 9) survived++;
            }
            totalSurvived += survived;
        }

        double avg = (double) totalSurvived / seasons;
        System.out.println("Average plants that survive = " + avg);
    }
}