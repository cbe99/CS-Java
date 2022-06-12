package Java.Numbers;

import java.util.Scanner;

public class multiplyButOne {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the length of the array list");
        int number = scanner.nextInt();
        int[] integerList = getIntegerArray(number);
        System.out.println("-----");
        System.out.println("the result is :" + getMultiplicationResult(integerList));
    }

    public static int[] getIntegerArray(int number) {
        System.out.println("enter the integers to be sorted");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            System.out.println("element " + i + " = ");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int getMultiplicationResult(int[] arrayList) {
        int result = 1;
        System.out.println(
                "enter the index of the number to be emitted between 1 to length," +
                        " (1 being 0 in array list & length being last i.e length-1)");
        int index = scanner.nextInt();
        int correctIndex = index - 1;
        if (index >= (arrayList.length) || index < 0) {
            System.out.println("invalid input");
            return -1;
        }
        for (int j = 0; j < (arrayList.length); j++) {
            if (j != correctIndex) {
                result *= arrayList[j];
            }
        }
        return result;

    }

}
