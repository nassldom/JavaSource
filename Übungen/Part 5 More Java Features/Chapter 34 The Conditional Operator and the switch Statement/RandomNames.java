import java.util.Random;

public class RandomNames {
    public static void main(String[] args) {
        Random rand = new Random();

        int firstPick = rand.nextInt(12);
        int lastPick = rand.nextInt(12);

        String firstName;
        String lastName;

        switch (firstPick) {
            case 0:  firstName = "Arin"; break;
            case 1:  firstName = "Lena"; break;
            case 2:  firstName = "Doran"; break;
            case 3:  firstName = "Mira"; break;
            case 4:  firstName = "Kael"; break;
            case 5:  firstName = "Tara"; break;
            case 6:  firstName = "Niko"; break;
            case 7:  firstName = "Elin"; break;
            case 8:  firstName = "Rovan"; break;
            case 9:  firstName = "Sira"; break;
            case 10: firstName = "Jarek"; break;
            default: firstName = "Vela"; break;
        }

        switch (lastPick) {
            case 0:  lastName = "Storm"; break;
            case 1:  lastName = "Raven"; break;
            case 2:  lastName = "Stone"; break;
            case 3:  lastName = "Light"; break;
            case 4:  lastName = "Ash"; break;
            case 5:  lastName = "Wolfe"; break;
            case 6:  lastName = "Vale"; break;
            case 7:  lastName = "Frost"; break;
            case 8:  lastName = "Drake"; break;
            case 9:  lastName = "Thorn"; break;
            case 10: lastName = "Brook"; break;
            default: lastName = "Flint"; break;
        }

        System.out.println("Random character name: " + firstName + " " + lastName);
    }
}