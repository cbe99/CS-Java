package Java.Vehicle;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String type, int wheels, int doors, int gears, boolean isManual) {
        super(name, type);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getgears() {
        return gears;
    }

    public boolean getisManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car gear is changed to " + this.currentGear);
    }

    public void changedVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("velocity: " + speed + "direction: " + direction);
    }
}
