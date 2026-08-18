package in.Stack;

import java.util.Stack;

public class StackLearn {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        // Pushing elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Banana"); // duplicate allowed

        System.out.println(stack);

        System.out.println("-------------------------");

        // Accessing top element
        System.out.println("Top Element (peek): " + stack.peek());

        System.out.println("-------------------------");

        // Popping element
        System.out.println("Popped Element: " + stack.pop());
        System.out.println(stack);

        System.out.println("-------------------------");

        // Searching element
        System.out.println("Position of 'Apple': " + stack.search("Apple")); // top is position 1

        System.out.println("-------------------------");

        // Checking if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        System.out.println("-------------------------");

        // Iterating Stack
        for(String fruit : stack)
        {
            System.out.println(fruit);
        }
    }
}
