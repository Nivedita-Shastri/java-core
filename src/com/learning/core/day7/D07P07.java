package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

      
        int size = scanner.nextInt();
        scanner.nextLine(); 

    
        String[] input = scanner.nextLine().split("\\s+");

     
        for (String str : input) {
            stack.push(Integer.parseInt(str));
        }
        
    boolean top=top(stack);
    System.out.println(top);
       
        
     
    }
     public static boolean top(Stack<Integer>stack) {
    	 if(stack.isEmpty()) {
    		 return false;
    	 }
    	  int top=stack.peek();
    	  return top%2==0;
     }
}
