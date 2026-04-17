public class Jam {
    private String contents;
    private String date;
    private int capacity;

    public Jam(String contents, String date, int capacity) {
        this.contents = contents;
        this.date = date;
        this.capacity = capacity;
    }

    public void spread(int fluidOz) {
        if (capacity == 0) {
            System.out.println("No jam in the Jar!");
        } else {
            int amount = Math.min(fluidOz, capacity);
            System.out.println("Spreading " + amount + " fluid ounces of " + contents);
            capacity = capacity - amount;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return contents + "   " + date + "   " + capacity + " fl. oz.";
    }
}