package Java.Numbers;
/*Problem:
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method, 
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
Example input/output
    * sumFirstAndLastDigit(252); → should return 4, 
        the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
    * sumFirstAndLastDigit(257); → should return 9, 
        the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
    * sumFirstAndLastDigit(0); → should return 0, 
        the first digit and the last digit is 0 since we only have 1 digit, 
        which gives us 0+0 and the sum is 0.
    * sumFirstAndLastDigit(5); → should return 10, 
        the first digit and the last digit is 5 since we only have 1 digit, 
        which gives us 5+5 and the sum is 10.
    * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.*/

/*Pseudocode:
Declare sum variable and initialize it with 0
Find the last digit. To find the last digit we can use % operator. The expression number%10 gives the last digit of the number.
Find the first digit of the number. For this
Find the total number of digits in the given number.
Divide the number by 10^(total_number_of_digits-1), it will give the first digit of the number.
Add first and the last digit to the sum variable.
*/

public class FirstAndLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(125));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        // int total_number_of_digits = findNumberOfDigits(number);

        int last = number % 10; // 252 % 10 = 2

        /*
         * int divisor = (int) Math.pow(10, total_number_of_digits - 1); // for 3, 10 ^
         * 2 >> 252/100 = 2
         * int first = number / divisor; // 252 / 100 = 2
         */
        while (number > 9) {
            number = number / 10;
        }

        sum = last + number; // first;
        return sum;

    }
    /*
     * private static int findNumberOfDigits(int number){
     * int count = 0;
     * while (number != 0){
     * count++;
     * number = number/10;
     * }
     * return count;
     * }
     */

}