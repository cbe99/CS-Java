package Java.PrinterChallenge;

public class Printer {
    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pages = 0;
        this.duplex = duplex;
    }

    public int fillToner(int tonerLevel) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pages2print = pages;
        if (this.duplex) {
            pages2print = (pages / 2) + (pages % 2);
            System.out.println("duplex printing");
        }
        this.pages += pages2print;
        return pages2print;
    }

    public int gettonerLevel() {
        return tonerLevel;
    }

    public int getpages() {
        return pages;
    }

    public boolean getduplex() {
        return duplex;
    }
}
