package Java.CarAnalogy;

public class Car {
    private boolean engine;
    private String name;
    private int wheels;
    private int cylinder;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine() {
        return "engine is started";
    }

    public String accelerate() {
        return "Car accelerated";
    }

    public String brake() {
        return "Car brake";
    }

}
