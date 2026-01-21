package Task1.Lvl1.Ex1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    public String play() {
        return "Està sonant un instrument de corda";
    }

    public String toString() {
        return "Instrument{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
