package com.learning.core.day2;
import java.util.Scanner;
public class D02P03 {
 public static void main(String args[]) {
                  
	 Scanner input = new Scanner(System.in);

     System.out.println("");
     int n1 = input.nextInt();

     System.out.println("");
     int n2 = input.nextInt();

     System.out.print("");
     String o = input.next();

     switch (o) {
     case "+":   
         System.out.println(n1 + n2);
         break;
     case "-":   
         System.out.println(n1 - n2);
         break;
     case "*":   
         System.out.println(n1 * n2);
         break;
     case "/":   
         System.out.println(n1 / n2);
         break;

     default:
         System.out.println("Error, invalid operand.");
}
 }
}
            