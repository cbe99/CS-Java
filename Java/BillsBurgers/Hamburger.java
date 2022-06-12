package Java.BillsBurgers;

public class Hamburger {
    private String name;
    private double price;
    private String breadRoll;
    private String meat;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;

    }

    public void addHamburger1(String name, double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void addHamburger2(String name, double price) {
        this.add2Name = name;
        this.add2Price = price;
    }

    public void addHamburger3(String name, double price) {
        this.add3Name = name;
        this.add3Price = price;
    }

    public void addHamburger4(String name, double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(
                this.name + " Hamburger on a " + this.breadRoll + " price = " + this.price + " meat " + this.meat);
        if (this.add1Name != null) {
            hamburgerPrice += this.add1Price;
            System.out.println("new price and name of addition : " + add1Name + " , " + add1Price);
        }
        if (this.add2Name != null) {
            hamburgerPrice += this.add2Price;
            System.out.println("new price and name of addition : " + add2Name + " , " + add2Price);
        }
        if (this.add3Name != null) {
            hamburgerPrice += this.add3Price;
            System.out.println("new price and name of addition : " + add3Name + " , " + add3Price);
        }
        if (this.add4Name != null) {
            hamburgerPrice += this.add4Price;
            System.out.println("new price and name of addition : " + add4Name + " , " + add4Price);
        }
        return hamburgerPrice;
    }

}
