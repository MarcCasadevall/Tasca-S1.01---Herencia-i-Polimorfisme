package Task1.Lvl1.Ex1;

public abstract class Instrument {
    private String name;
    private int price;
    private static String prueba = "probando";
    static {
        System.out.println("Esto se inciara una sola vez cuando abra la clase");
    }

    {
        System.out.println("Esto se iniciara cada vez que cree un objeto");
    }

    public Instrument(String nom, int price) {
        this.name = nom;
        this.price = price;
    }

    public static String getPrueba() {
        return prueba;
    }

    public static void setPrueba(String prueba) {
        Instrument.prueba = prueba;
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

    public String play() {
        return "";
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
