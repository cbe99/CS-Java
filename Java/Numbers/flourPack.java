package Java.Numbers;
/* ProblemSet:
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 
    The parameter bigCount represents the count of big flour bags (5 kilos each).
    The parameter smallCount represents the count of small flour bags (1 kilo each).
    The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. 
The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. 
For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false 
    since each big bag is 5 kilos and cannot be divided. 
However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true 
    because of 1 full bigCount bag and 4 full smallCount bags equal goal, 
and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.

EXAMPLE INPUT/OUTPUT:
* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) 
    and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) 
    and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
* canPack (-3, 2, 12); should return false since bigCount is negative.

NOTE: The method canPack should be defined as public static like we have been doing so far in the course.
*/

/*Pseudocode:
1. Validate the parameters
2. determine how much of bigCount to use: all or few
3. determine how much of smallCount to use after using the bigCount
*/

public class flourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 5, 9));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack2(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigOne = bigCount < goal / 5 ? bigCount : goal / 5; // bigcount = 2, goal/5 = 11/5=2 bigCount = goal/5 .>>
                                                                // bigOne = 2
        int smallOne = (goal - bigOne * 5); // smallOne = goal -bigOne*5 = 11 - 2*5 = 11-10 = 1

        if (smallOne <= smallCount)
            return true; // smallOne = 1 < smallCount = 2 > true
        else
            return false;
    }

    public static boolean canPack2(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        if ((bigCount * 5 + smallCount) < goal)
            return false; // supply should be greater than demand
        // bigCount = 2, smallCount = 2, goal = 11: 2*5 + 2 = 12 < 11 : true

        return (goal % 5 <= smallCount); // remainder of goal should be less than smallCount
        // goal = 11 % 5 = 1 < smallCount = 2 : true
    }
}