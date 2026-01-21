package Task1.Lvl1.Ex1;

public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }
    public String play(){
        return "Està sonant un instrument de percussió";

    }

    public String toString() {
        return "Instrument{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
