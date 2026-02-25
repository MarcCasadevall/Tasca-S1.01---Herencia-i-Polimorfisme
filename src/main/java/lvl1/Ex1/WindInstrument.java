package lvl1.Ex1;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    public String play() {
        return "A ventilation instrument is playing\n";
    }

    public String toString() {
        return "Instrument{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
