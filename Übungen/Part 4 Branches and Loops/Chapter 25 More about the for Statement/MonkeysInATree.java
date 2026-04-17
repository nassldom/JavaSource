public class MonkeysInATree {
    public static void main(String[] args) {
        for (int monkeys = 5; monkeys >= 1; monkeys--) {
            String word;

            if (monkeys == 5) word = "Five";
            else if (monkeys == 4) word = "Four";
            else if (monkeys == 3) word = "Three";
            else if (monkeys == 2) word = "Two";
            else word = "One";

            System.out.println(word + " little monkeys swinging in a tree");
            System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
            System.out.println("Along came the crocodile as quiet as can be");
            System.out.println("and SNAP!");
            System.out.println();
        }

        System.out.println("No little monkeys swinging in a tree");
        System.out.println("No little monkeys swinging in a tree");
    }
}