package Java.BillsBurgers;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("delux", "white", "bacon", 7.80);
        super.addHamburger1("chips", 2.5);
        super.addHamburger2("drink", 3.65);
    }

    @Override
    public void addHamburger1(String name, double price) {
        System.out.println("add on not available");
    }

    @Override
    public void addHamburger2(String name, double price) {
        System.out.println("add on not available");
    }

    @Override
    public void addHamburger3(String name, double price) {
        System.out.println("add on not available");
    }

    @Override
    public void addHamburger4(String name, double price) {
        System.out.println("add on not available");
    }

}
