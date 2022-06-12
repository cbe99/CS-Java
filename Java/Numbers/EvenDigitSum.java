package Java.Numbers;
/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
    * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
    * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
    * getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
*/

/*Pseudo code:
1. return -1 if negative integer
2. initialize sum and last
3. use a while loop till > 0
    i. find out the last digit of the number >> 253 % 10 = 3 odd
    ii. if the last digit is even, add to sum
    iii. find for the number after omitting the last digit >> 253 / 10 = 25
    >> 25 % 10 = 5 odd
    >> 25 / 10 = 2 even
    sum = 0 + 2
    ex 2: 123456789
    123456789 % 10 = 9 odd, 123456789 / 10 = 12345678 % 10 = 8 even sum = 8
    12345678/10 = 1234567 % 10 = 7 odd, 1234567 / 10 = 123456 % 10 = 6 = sum = 8+6=14
    123456/10 = 12345 % 10 = 5 odd, 12345 / 10 = 1234 % 10 = 4 = sum = 14 + 4 = 18
    1234/10 = 123 % 10 = 3 odd, 123 / 10 = 12 % 10 = 2 = sum = 20
    12/10 = 1 odd, 1%10 = 0, 1/10 = 0 end.
*/

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(122));
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int last = 0;
        while (number > 0) {
            last = number % 10;
            if (last % 2 == 0) {
                sum += last;
            }
            number = number / 10;
        }
        return sum;
    }
}
