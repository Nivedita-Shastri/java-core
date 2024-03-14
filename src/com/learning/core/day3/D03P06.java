package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
	public static void main(String[] args)
	        
	    {
		 Scanner sc= new Scanner(System.in);
	        String str = sc.nextLine();
	        str = str.toLowerCase();
	        int count = 0;
	         for (int i = 0; i < str.length(); i++) {
	        
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	               
	                count++;
	                System.out.println(str.charAt(i));
	            }
	            }
	       
	        int n =sc.nextInt();
	        System.out.print("");
	        if(n>count)
	        {
	        System.out.println("Mismatch in vowel count");	
	        }	      
}
}