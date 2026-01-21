package Task1.Lvl1;

public abstract class Instrument {
    private String name;
    private int price;

    public Instrument(String nom, int price) {
        this.name = nom;
        this.price = price;
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
  public String play (){
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
