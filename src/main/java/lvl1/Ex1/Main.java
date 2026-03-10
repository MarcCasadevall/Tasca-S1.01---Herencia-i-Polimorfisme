package lvl1.Ex1;

public class Main {
    public static void main(String[] args) {

        Instrument flute = new WindInstrument("Flute", 500);
        Instrument guitar = new StringInstrument("Guitar", 800);
        Instrument battery = new PercussionInstrument("Battery", 1000);
        System.out.println(flute.play());
        System.out.println(guitar.play());
        System.out.println(battery.play());
        System.out.println(Instrument.getTesting());

    }
}
