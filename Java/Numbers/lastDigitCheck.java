package Java.Numbers;

/*
Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share 
    the same rightmost digit; otherwise, it should return false.
EXAMPLE INPUT/OUTPUT:
    * hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    * hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
    * hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range 
    of 10(inclusive) - 1000(inclusive), otherwise return false.
EXAMPLE INPUT/OUTPUT
* isValid(10); → should return true since 10 is within the range of 10-1000
* isValid(468); → should return true since 468 is within the range of 10-1000
* isValid(1051); → should return false since 1051 is not within the range of 10-1000
NOTE: All methods need to be defined as public static as we have been doing so far in the course.
*/
public class lastDigitCheck {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 2, 400));
        System.out.println(hasSameLastDigit(32, 72, 25));
        System.out.println(hasSameLastDigit(35, 48, 36));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) { // 1. proceed only if valid returns true

            int last1 = num1 % 10; // 252%10 = 2 // 3.use modulo for each of 3 to find the last digit
            int last2 = num2 % 10;
            int last3 = num3 % 10;

            if ((last1 == last2) || (last2 == last3) || (last1 == last3)) { // 4. if any of lasts are same, return true
                return true;
            }
        }
        return false; // 5. returns false when 'if' statement doesn't returns true
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) { // 2. check if not valid, returns false if not
            return false;
        }
        return true;
    }

}
