package lvl1.Ex1;

public abstract class Instrument {
    private String name;
    private int price;
    private static String testing = "testing";

    static {
        System.out.println("\n" +
                "This runs once when the class is loaded");
    }

    {
        System.out.println("This runs every time an object is created");
    }

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static String getTesting() {
        return testing;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
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
