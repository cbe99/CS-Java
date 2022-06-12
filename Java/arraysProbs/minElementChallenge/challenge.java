package Java.arraysProbs.minElementChallenge;

import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        int minimum = findMin(array);
        System.out.println("the minimum is " + minimum);

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.close();
        return capacity;
    }

    private static int[] readElements(int values) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for (int i = 0; i < elements.length; i++) {
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = totalElementEntered;

        }
        scanner.close();
        return elements;

    }

    private static int findMin(int[] count) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            int minVal = count[i];
            if (minVal < min) {
                min = minVal;
            }
        }
        return min;
    }

}
