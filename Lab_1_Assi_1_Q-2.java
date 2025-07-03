/* 
Write Java Program to find maximum number using ternary operator.
 */

 //creating a class named FindMax
 public class FindMax {
    public static void main(String[] args) {
        // declaring two integer variables a and b
        int a = 10, b = 20;

        // using ternary operator to find the maximum value between a and b
        int max = (a > b) ? a : b;

        // printing the maximum value
        System.out.println("Maximum value is: " + max);
    }
}

/*
 * output:
 * Maximum value is: 20
 */