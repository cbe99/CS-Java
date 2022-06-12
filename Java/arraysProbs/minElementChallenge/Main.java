package Java.arraysProbs.minElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("find the count of arrays: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        // call to read the array with count elements
        int[] IntegerList = readIntegers(count);
        System.out.println("integer arrays list is: " + Arrays.toString(IntegerList));
        // call findMin function
        System.out.println("min element is: " + findMin(IntegerList));
    }

    public static int[] readIntegers(int count) {
        System.out.println("enter the " + count + " elements : ");
        int[] arrays = new int[count];
        for (int i = 0; i < count; i++) {
            arrays[i] = scanner.nextInt();
        }
        return arrays;

    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        return min;
    }

}
