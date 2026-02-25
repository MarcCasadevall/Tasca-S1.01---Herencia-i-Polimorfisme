package lvl1.Ex2;

public class Car {
    private static final String brand = "Ford";
    private static String model;
    private final int power;

    public Car(int power) {
        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }

    public static void brake() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerate() {
        System.out.println("El vehicle està accelerant");
    }

    @Override
    public String toString() {
        return "El Cotxe " + brand + " " +  getModel() + " te " + getPower() + " CV";
    }
}
