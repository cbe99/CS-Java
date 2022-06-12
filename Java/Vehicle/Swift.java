package Java.Vehicle;

public class Swift extends Car {
    private int roadServiceMonths;

    public Swift(int roadServiceMonths) {
        super("Swift", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getcurrentVelocity() + rate;
        if (newVelocity == 0) {
            StopVelocity();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0) {
            changedVelocity(newVelocity, getcurrentDirection());
        }

    }

}
