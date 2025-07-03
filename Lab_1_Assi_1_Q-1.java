/* 
 * Write Java Program to find factorial of a number.
 */

// creating a class named Factorial
public class Factorial {
    public static void main(String[] args) {
        // declaring an integer variable to hold the number
        int number = 3;
        int result = 1;

        // using a for loop to calculate the factorial
        // iterating from 1 to the number
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        // printing the factorial result
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

/*
 * output:
 * Factorial of 3 is: 6
 */