package lvl1.Ex1;

public abstract class Instrument {
    private String name;
    private int price;
    private static String testing = "testing";

    static {
        System.out.println("\n" +
                "This will start only once when you open the class");
    }

    {
        System.out.println("This will start only once when you open a object");
    }

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static String getTesting() {
        return testing;
    }

    public static void setTesting(String testing) {
        Instrument.testing = testing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
