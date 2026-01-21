package Task1.Lvl1;

public class StringInstrument extends Instrument {

    public StringInstrument(String nom, int price) {
        super(nom, price);
    }

    public String play() {
        return "Està sonant un instrument de corda";
    }

    public String toString() {
        return "StringInstrument{}";
    }
}
