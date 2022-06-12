package Java.Numbers.MinNMax;

import java.util.Scanner;

public class minNmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX = Integer.MIN_VALUE;

        int MIN = Integer.MAX_VALUE;
        // boolean first = true;
        while (true) {
            System.out.println("enter numbers: ");
            boolean ifInt = scanner.hasNextInt();

            if (ifInt) {

                int number = scanner.nextInt();

                /*
                 * if (first){
                 * first = false;
                 * MIN = number;
                 * MAX = number;
                 * }
                 */

                if (number < MIN) {
                    MIN = number;
                }

                if (number > MAX) {
                    MAX = number;
                }
            } else {
                break;
            }

            scanner.nextLine();

        }

        System.out.println("Min : " + MIN);
        System.out.println("Max: " + MAX);
        scanner.close();
    }

}
