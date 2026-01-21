package Task1.Lvl1;

public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String nom, int price) {
        super(nom, price);
    }
    public String play(){
        return "Està sonant un instrument de percussió";

    }

    public String toString() {
        return "PercussionInstrument{}";
    }
}
