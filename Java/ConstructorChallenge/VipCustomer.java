package Java.ConstructorChallenge;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailID;

    public VipCustomer() {
        this("Mr. Name Unknown", 100.00, "Unknown emailID");

    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown emailID");

    }

    public VipCustomer(String name, double creditLimit, String emailID) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailID = emailID;
    }

    public String getname() {
        return name;
    }

    public double getcreditLimit() {
        return creditLimit;
    }

    public String getemailID() {
        return emailID;
    }
}