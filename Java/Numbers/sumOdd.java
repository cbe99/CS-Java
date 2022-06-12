package Java.Numbers;
/*1. Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise  return false.

2. Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input. 
Example input/output:
* sumOdd(1, 100); → should return 2500
* sumOdd(-1, 100); →  should return -1
* sumOdd(100, 100); → should return 0
TIP: use the remainder operator to check if the number is odd
NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code. */

public class sumOdd {
    public static boolean isOdd(int number) {
        if (number <= 0) // if number is not > 0, return false
            return false;
        if (number % 2 == 0) { // if number is odd, return true
            return false;
        } else
            return true;
    }

    public static int SumOfOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        System.out.println(isOdd(-7));
        System.out.println(SumOfOdd(100, 100));
    }

}
