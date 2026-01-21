package Task1.Lvl1.Ex2;


public class Car {
    static final String brand = "Ford";
    static String model;
    final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerate() {
        System.out.println("El vehicle està accelerant");
    }
}
