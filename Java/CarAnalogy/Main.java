package Java.CarAnalogy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.getEngine());
        System.out.println(car.getWheels());

    }
}