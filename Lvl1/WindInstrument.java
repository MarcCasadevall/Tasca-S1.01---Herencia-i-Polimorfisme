package Task1.Lvl1;

public class WindInstrument extends Instrument {

    public WindInstrument(String nom, int price) {
        super(nom, price);
    }

    public String play() {
        return "Està sonant un instrument de vent";
    }

    public String toString() {
        return "WindInstrument{}";
    }
}
