public class Hello {
    public static void main(String[] args) {
        HelloObject h = new HelloObject(
            "Good morning World!",
            "Good evening World!"
        );

        h.speakMorning();
        h.speakEvening();
    }
}