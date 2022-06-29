package Java.BankingChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Punjab Bank");
        if (bank.addBranch("Punjab")) {
            System.out.println("branch created");
        }
        bank.addBranch("Punjab");
        bank.addCustomer("Punjab", "Nina", 50.98);

        bank.addCustomer("Punjab", "Rahul", 1890.78);
        bank.addCustomer("Punjab", "Micky", 89054.20);
        bank.addBranch("Jaipur");
        bank.addCustomer("Jaipur", "Billy", 987.97);
        bank.addCustomerTransaction("Punjab", "Nina", 24.90);

        bank.listCustomers("Punjab", true);
        bank.listCustomers("Jaipur", true);
        bank.addBranch("Kerala");

        if (!bank.addCustomer("Kerala", "Nisha", 9066.89)) {
            System.out.println("error, no branch");
        }
        if (!bank.addBranch("Punjab")) {
            System.out.println("branch already exists");
        }

        if (!bank.addCustomerTransaction("Punjab", "Ferguson", 987.48)) {
            System.out.println("customer doesnot exists");
        }
        if (!bank.addCustomer("Punjab", "Nina", 12.21)) {
            System.out.println("customer already exists");
        }

    }

}
