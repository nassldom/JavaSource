public class Pantry {
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;

    private Jam selected;

    public Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    public Pantry(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null;
    }

    public Pantry(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    public boolean select(int jarNumber) {
        if (jarNumber == 1 && jar1 != null) {
            selected = jar1;
            return true;
        } else if (jarNumber == 2 && jar2 != null) {
            selected = jar2;
            return true;
        } else if (jarNumber == 3 && jar3 != null) {
            selected = jar3;
            return true;
        } else {
            selected = null;
            return false;
        }
    }

    public void spread(int amount) {
        if (selected != null) {
            selected.spread(amount);
        } else {
            System.out.println("Selection not available");
        }
    }

    public void replace(Jam j, int slot) {
        if (slot == 1) {
            jar1 = j;
        } else if (slot == 2) {
            jar2 = j;
        } else if (slot == 3) {
            jar3 = j;
        }
    }

    public void mixedFruit() {
        if (jar1 != null && jar2 != null && jar3 != null) {
            if (jar1.getCapacity() <= 2 &&
                jar2.getCapacity() <= 2 &&
                jar3.getCapacity() <= 2) {

                int total = jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity();
                String date = jar1.getDate();

                jar1 = new Jam("Mixed Fruit", date, total);
                jar2 = null;
                jar3 = null;
                selected = null;
            }
        }
    }

    public void print() {
        System.out.print(this);
    }

    public String toString() {
        String result = "";

        if (jar1 != null) {
            result += "1: " + jar1 + "\n";
        }
        if (jar2 != null) {
            result += "2: " + jar2 + "\n";
        }
        if (jar3 != null) {
            result += "3: " + jar3 + "\n";
        }

        return result;
    }
}