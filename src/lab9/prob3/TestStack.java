package lab9.prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        // Basic operations (these will break when you add checks—students will add try/catch later)
        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop, peek: " + stack.peek());
        System.out.println("Stack: " + stack);
        stack.push(30);

        // Uncomment later when exceptions are implemented
        // stack.push(40);            // should cause overflow
        try {
            stack.push(40);
            System.out.println("Push successful: " + stack);
        } catch (IllegalStateException e) {
            System.out.println("Error pushing to stack: " + e.getMessage());
        }

        // stack.push(null);          // should cause null not allowed
        try {
            stack.push(null);
            System.out.println("Null push successful");
        } catch (NullPointerException e) {
            System.out.println("Error pushing null to stack: " + e.getMessage());
        }
        stack.pop(); stack.pop(); stack.pop(); // empty now
        // stack.pop();               // should cause underflow
        try {
            Integer result = stack.pop();
            System.out.println("Pop successful: " + result);
        } catch (EmptyStackException e) {
            System.out.println("Error popping from the stack: Stack is empty");
        }

        // stack.peek();              // should cause underflow

        try {
            Integer result = stack.peek();
            System.out.println("Peek successful: " + result);
        } catch (EmptyStackException e) {
            System.out.println("Error peeking stack: Stack is empty");
        }
    }
}
