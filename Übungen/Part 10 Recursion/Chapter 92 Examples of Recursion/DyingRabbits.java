public class DyingRabbits {
    public static long rabbits(int month) {
        if (month <= 0) return 0;
        if (month == 1 || month == 2) return 1;
        if (month == 3 || month == 4) return rabbits(month - 1) + rabbits(month - 2);
        // ab dem 5. Monat sterben die Tiere von vor 4 Monaten
        return rabbits(month - 1) + rabbits(month - 2) - rabbits(month - 5);
    }
}