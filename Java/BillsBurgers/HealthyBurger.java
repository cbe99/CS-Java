package Java.BillsBurgers;

public class HealthyBurger extends Hamburger {
    private String healthy1name;
    private double healthy1price;

    private String healthy2name;
    private double healthy2price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addOn1Healthy(String name, double price) {
        this.healthy1name = name;
        this.healthy1price = price;
    }

    public void addOn2Healthy(String name, double price) {
        this.healthy2name = name;
        this.healthy2price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (healthy1name != null) {
            System.out.println("added " + this.healthy1name + " " + this.healthy1price);
        }
        if (healthy2name != null) {
            System.out.println("added " + this.healthy2name + " " + this.healthy2price);
        }
        return hamburgerPrice;
    }

}
