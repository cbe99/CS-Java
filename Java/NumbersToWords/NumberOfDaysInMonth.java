package Java.NumbersToWords;

/*1.Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, 
calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:
 isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
 isLeapYear(1600); → should return true since 1600 is a leap year
NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. 
You can use that solution if you wish.

2. Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. 
Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:
    getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
    getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
NOTE: Do not add a main method to solution code. */

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(isLeapYear(9000));
        System.out.println(getDaysInMonth(2, 1600));
        System.out.println(getDaysInMonth(8, 1999));

    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if ((year < 1) || (year > 9999)) {
            leapYear = false;
        } else if (((year % 4 == 0) && (year % 400 == 0)) || ((year % 4 == 0) && (year % 100 != 0))) {
            leapYear = true;
            // leap year if year % (4 && 100 && 400) or (4 and not by 100)
        }

        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999))
            return -1;
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }

            default:
                break;
        }
        return days;
    }
}