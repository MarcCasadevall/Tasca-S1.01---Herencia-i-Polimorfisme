package lvl1.Ex2;

public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car.setModel("Focus");
        Car car1 = new Car(200) {
        };
        car1.accelerate();
        System.out.println(car1.toString());

        Car.setModel("Fiesta");
        Car car2 = new Car(120) {
        };
        System.out.println(car2.toString());
    }
}
