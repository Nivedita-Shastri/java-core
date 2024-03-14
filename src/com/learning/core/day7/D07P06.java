package com.learning.core.day7;
import java.util.Scanner;
import java.util.Stack;

public class D07P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

      
        int size = scanner.nextInt();
        scanner.nextLine(); 

    
        String[] input = scanner.nextLine().split("\\s+");

     
        for (String str : input) {
            stack.push(Integer.parseInt(str));
        }

      
        int min = Integer.MAX_VALUE;
        for (int num : stack) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
        scanner.close();
    }
}
