package Java.arraysProbs.arraySizing;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static int[] baseArray = new int[10];

    public static void main(String[] args) {
        System.out.println("enter the 10 integers: ");
        getInput();
        printArray(baseArray);
        resizeArray();
        System.out.println("enter 12 integers");

        printArray(baseArray);

    }

    private static void getInput() {
        for (int i = 0; i < baseArray.length; i++)
            baseArray[i] = s.nextInt();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    private static void resizeArray() {
        int[] original = baseArray;
        baseArray = new int[12];
        for (int i = 0; i < original.length; i++)
            baseArray[i] = original[i];
    }
}
