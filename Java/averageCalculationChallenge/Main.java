package Java.averageCalculationChallenge;

//scanner import automatic
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // array of type int
        int[] myIntegers = getIntegers(5); // calls getIntegers class
        for (int i = 0; i < myIntegers.length; i++) { // counts upto number in array
            System.out.println("Element " + i + " , typed value was " + myIntegers[i]); // prints the integers from
                                                                                        // arrays
        }
        System.out.println("The average is " + getAverage(myIntegers)); // prints the average after class call
    }

    // returns an array of number" value of integers
    public static int[] getIntegers(int number) { // takes the number as a parameter
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number]; // arrays called values takes in the values of the ints
        for (int i = 0; i < values.length; i++) { // func call upto number""" amount
            values[i] = scanner.nextInt(); // scans and puts into array values
        }
        return values; // returns the arrays
    }

    public static double getAverage(int[] arrays) { // puts in the arrays
        int sum = 0;
        for (int j = 0; j < arrays.length; j++) { // upto arrays' length call
            sum += arrays[j]; // sum is added
        }
        return (double) sum / (double) arrays.length; // returns divided by length

    }

}
