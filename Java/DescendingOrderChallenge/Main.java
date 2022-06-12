package Java.DescendingOrderChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of integers to be ordered? ");
        int number = scanner.nextInt();
        int[] integerList = getIntegerList(number);
        int[] sorted = sortIntegers(integerList);
        printArray(sorted);

    }

    public static int[] getIntegerList(int number) {
        System.out.println("enter the integers to be sorted: \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            System.out.println("element " + i + " = \r");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println("element " + i + " contents : " + Array[i]);
        }

    }

    public static int[] sortIntegers(int[] integerList) {

        /*
         * int[] sortedArray = new int[integerList.length];
         * for (int i = 0; i < integerList.length; i++) {
         * sortedArray[i] = integerList[i];
         * }
         */
        int[] sortedArray = Arrays.copyOf(integerList, integerList.length);
        boolean flag = true;
        int temp;
        while (flag) { // runs until true, at least once
            flag = false; // continue with loop only if for-loop sorted, we reset to true
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    flag = true; // only exit if all is sorted
                }
            }
        }
        return sortedArray;
    }

    /*
     * int max = Integer.MIN_VALUE;
     * int x = integerList.length - 1;for(
     * int j = x;j>=0;j--)
     * {
     * if (integerList[j] > max) {
     * max = integerList[j];
     * }
     * 
     * }System.out.println(i+" = "+max);
     */
}
