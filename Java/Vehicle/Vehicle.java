package Java.Vehicle;

public class Vehicle {
    private String name;
    private String type;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getcurrentDirection() {
        return currentDirection;
    }

    public int getcurrentVelocity() {
        return currentVelocity;
    }

    public void StopVelocity() {
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle steering at " + currentDirection);

    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
    }

}
