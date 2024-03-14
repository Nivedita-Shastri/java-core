package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {
	 public static void main (String[]args)
	  {
	    Scanner input = new Scanner(System.in);
		System.out.println("");
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++)
	        sum = sum + i;
	    System.out.println (sum);

      }
}