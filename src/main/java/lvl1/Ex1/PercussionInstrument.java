package lvl1.Ex1;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    public String play() {
        return "\n" + "A percussion instrument is playing";

    }
}
