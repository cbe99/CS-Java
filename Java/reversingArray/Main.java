package Java.reversingArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] example = { 1, 2, 3, 4, 5 };
        reverse(example);
        System.out.println(Arrays.toString(example));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }
}
