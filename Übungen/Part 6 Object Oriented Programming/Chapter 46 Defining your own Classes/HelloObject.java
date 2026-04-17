class HelloObject {
    private String greeting;
    private String morningGreeting;
    private String eveningGreeting;

    // Übung 1 & 3: Standard-Konstruktor mit einfachem Gruß
    public HelloObject(String greeting) {
        this.greeting = greeting;
    }

    // Übung 2: Konstruktor mit Morgen- und Abendgruß
    public HelloObject(String morningGreeting, String eveningGreeting) {
        this.morningGreeting = morningGreeting;
        this.eveningGreeting = eveningGreeting;
    }

    // Übung 4: Copy-Konstruktor (shallow copy – gleiche String-Referenz)
    public HelloObject(HelloObject init) {
        this.greeting = init.greeting; // gleiche String-Instanz
    }

    // Übung 4 – Variante: Copy-Konstruktor mit neuer String-Instanz (deep copy für String)
    public static HelloObject copyWithNewString(HelloObject init) {
        HelloObject copy = new HelloObject(new String(init.greeting));
        return copy;
    }

    // Übung 1: Gruß so oft ausgeben wie die Länge des Textes
    public void speakMany() {
        if (greeting == null) return;
        int count = greeting.length();
        for (int i = 0; i < count; i++) {
            System.out.println(greeting);
        }
    }

    // Übung 2: Morgen- und Abendgruß
    public void speakMorning() {
        if (morningGreeting != null) {
            System.out.println(morningGreeting);
        }
    }

    public void speakEvening() {
        if (eveningGreeting != null) {
            System.out.println(eveningGreeting);
        }
    }

    // Übung 3: einfacher speak(), der genau einen Gruß ausgibt
    public void speak() {
        if (greeting != null) {
            System.out.println(greeting);
        }
    }
}