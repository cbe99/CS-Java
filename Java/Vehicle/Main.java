package Java.Vehicle;

public class Main {
    public static void main(String[] args) {
        Swift swift = new Swift(36);
        swift.accelerate(30);
        swift.steer(45);
        swift.accelerate(20);
        swift.accelerate(-42);
    }

}
