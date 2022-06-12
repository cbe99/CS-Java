package Java.BillsBurgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "white", "sausage", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburger1("tomato", 0.25);
        System.out.println(hamburger.itemizeHamburger());
        System.out.println(price);
        HealthyBurger healthy = new HealthyBurger("bacon", 5.5);
        healthy.addHamburger1("egg", 5);
        System.out.println("total : " + healthy.itemizeHamburger());
        System.out.println();
        DeluxeBurger delux = new DeluxeBurger();
        System.out.println(delux.itemizeHamburger());
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburger1("Should not do this", 50.53);
        db.itemizeHamburger();

    }

}
