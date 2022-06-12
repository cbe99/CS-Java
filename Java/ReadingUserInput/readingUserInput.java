
package Java.ReadingUserInput;

import java.util.Scanner;
/*Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner like we did in the previous video.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.

Hint: 
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you donft need it anymore.
-Create a project with the name ReadingUserInputChallenge.*/

public class readingUserInput {
    public static void main(String[] args) {
        // first open a scanner
        Scanner scanner = new Scanner(System.in);
        int counter = 0; // counts valid numbers
        int sum = 0; // calculates sum of valid
        // while(true){ //endless loop unless ended inside
        while (counter < 10) {
            int order = counter + 1; // order keeps in track // order no starts from 1, counter 0
            System.out.println("Enter number" + order + ": ");
            boolean isAnInt = scanner.hasNextInt(); // checks if valid number is added
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                /*
                 * if (counter == 10){
                 * break;
                 * }
                 */
            } else {
                System.out.println("Invalid");
            }
            scanner.nextLine(); // handles end of line enter key
        }

        System.out.println("sum: " + sum);
        scanner.close();
    }
}
