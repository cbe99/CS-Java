package Java.Numbers;

/*ProblemSet:
Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, 
    the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.

EXAMPLE INPUT/OUTPUT:
* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
* getLargestPrime (-1); should return -1 since the parameter is negative

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
*/

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(15));
        System.out.println(getLargestPrime(189));
        System.out.println(getLargestPrime(1256));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) { // factor
                number /= i; // decreasing to find max factor n prime
                i--;
            }
        }
        return number;
    }
}

/*
 * for loop:
 * number 45
 * 45%2 false; 45%3= 0: 45/3=15; 3-1 = 2
 * 15%2 false; 15%3 = 0: 15/3 = 5; 3-1 = 2
 * 5%2 false; 5%3 false; 5%4 false; loop stop
 * number = 5 highest prime
 */
