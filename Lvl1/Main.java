package Task1.Lvl1;

public class Main {
    public static void main(String[] args) {

        WindInstrument Flute = new WindInstrument("Flute", 500) {
        };
        StringInstrument Guitar = new StringInstrument("Guitar", 800) {
        };
        PercussionInstrument Battery = new PercussionInstrument("Battery", 1000) {
        };
        System.out.println(Flute.play());
        System.out.println(Guitar.play());
        System.out.println(Battery.play());
    }

}