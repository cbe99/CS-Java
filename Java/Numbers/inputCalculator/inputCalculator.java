package Java.Numbers.inputCalculator;

import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int SUM = 0;
        int AVG = 0;
        int count = 0;
        System.out.println("INPUT:");
        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                SUM += number;
                count++;
                AVG = (int) Math.round((double) SUM / (double) count);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + SUM + " AVG = " + AVG);

        scanner.close();

    }
}