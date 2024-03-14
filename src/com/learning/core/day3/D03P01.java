package com.learning.core.day3;
import java.util.Scanner;
public class D03P01 {
	public static void main(String[] args) {
		
	    String reverseStr="";
        Scanner sc =new Scanner(System.in);
        System.out.print("");
        String str= sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println("It is a Palindrome ");
	    }
	    else {
	      System.out.println("It is not a Palindrome ");
	    }
      
}
}