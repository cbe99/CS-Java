package Java.PrinterChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial pages count = " + printer.getpages());
        int pages = printer.printPages(4);
        System.out.println("pages printed " + pages + "new total print count for printer " + printer.getpages());
    }

}
