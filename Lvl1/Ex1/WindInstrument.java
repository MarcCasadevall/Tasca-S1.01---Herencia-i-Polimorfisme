package Task1.Lvl1.Ex1;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    public String play() {
        return "Està sonant un instrument de vent";
    }

    public String toString() {
        return "Instrument{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
