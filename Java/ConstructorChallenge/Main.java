package Java.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
        System.out.println("------");
        VipCustomer defaulter = new VipCustomer();
        System.out.println(defaulter.getcreditLimit());
        System.out.println(defaulter.getemailID());
        System.out.println(defaulter.getname());

        VipCustomer Modiji = new VipCustomer("Modiji", 500);
        System.out.println(Modiji.getemailID());
        System.out.println(Modiji.getcreditLimit());

    }

}
