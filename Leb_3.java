/* 
 * Write a program to declare stack. Store 10 elements into it. 
 * Remove 4 elements from stack and display it.
 */

import java.util.Stack;

// Create a class
public class Leb_3 {

    public static void main(String[] args) {


        Stack<Integer> myStacks = new Stack<>();

        // Push 10 elements into the stack
        myStacks.add(1);
        myStacks.add(2);
        myStacks.add(3);
        myStacks.add(4);
        myStacks.add(5);
        myStacks.add(6);
        myStacks.add(7);
        myStacks.add(8);
        myStacks.add(9);
        myStacks.add(10);

        //Display the Element After the adding Element Stack
        System.out.println("After adding the 10 elements in stack: " + myStacks);

        // Remove 4 elements from the stack
        myStacks.pop();
        myStacks.pop();
        myStacks.pop();
        myStacks.pop();

        //Display the Element After the pop or Remove from the Stack
        System.out.println("After removing the 4 elements from stack: " + myStacks);
    }
}

/*
 OUTPUT:
After adding the 10 elements in stack :[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
After removing the 4 elements from stack :[1, 2, 3, 4, 5, 6]
 */
