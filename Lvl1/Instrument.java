package Task1.Lvl1;

public abstract class Instrument {
    private String nom;
    private int price;

    public Instrument(String nom, int price) {
        this.nom = nom;
        this.price = price;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
