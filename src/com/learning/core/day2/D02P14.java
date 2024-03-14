package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
	 public static void main(String[] args) { 
		 System.out.println("");
		  Scanner cap = new Scanner(System.in);
		  int base = cap.nextInt();
		  int exponent = cap.nextInt();
	      int result = 1;  
	      for (int i = 0; i < exponent; i++) {  
	            result *= base;  
	        }  
	        System.out.println(result);  
	    }  

}
