package lvl1.Ex1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    public String play() {
        return "A string instrument is playing";
    }
}
