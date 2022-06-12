package Java.Numbers;

/*
Write a method named getGreatestCommonDivisor with two parameters of 
    type int named first and second. 
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully 
    divide each of the integers (i.e. without leaving a remainder).
For example 12 and 30:
    12 can be divided by 1, 2, 3, 4, 6, 12
    30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
EXAMPLE INPUT/OUTPUT:
* getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
* getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
* getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
* getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
    HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
    HINT: Find the minimum of the two numbers.
    NOTE: The method getGreatestCommonDivisor should be defined as public static like we have been doing so far in the course.
    NOTE: Do not add a main method to the solution code.
*/
public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 36));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(13, 17));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1; // 1. return -1 if any of the number is less than 10
        int min = first < second ? first : second; // 2. assign the lower number b/w first and second to min variable

        for (int i = min; i >= 1; i--) { // for loop, where initiator i = minimum value, stops when it is 1, keeps
                                         // decrementing
            if (first % i == 0 && second % i == 0)
                return i;
        }
        return 1;
    }
}
// 1. (9,36) ->> 9 < 10 returns -1
// 2. (25, 15) ->> 25, 15 > 10, 25<15? returns 15: min = 15 -> divisor = 0 -> i
// = 15; 25%15: 10,
// 15%15 = 0; 25%14: 11, 15%15 = 0;... 25 % 5 = 0; 15%15 = 0; divisor = i = 5
// GCD = 5.
// 3. 13 & 17 : 13%13 = 0; 17%13 = 4; 13%12 = 1; 17%12 = 5..... 13%1 = 0; 17%1=0
// GCD = 0