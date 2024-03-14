
package com.learning.core.day7; 
import java.util.Stack;

public class D07P05 {
    public static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, value);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

       // System.out.print("");
        printStack(stack);

        reverse(stack);

       System.out.print("\n");
        printStack(stack);
    }

    public static void printStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            int value = temp.pop();
            System.out.print(value + " ");
            stack.push(value);
        }
    }
}
