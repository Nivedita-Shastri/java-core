package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {
	
public static void main (String[] args)
{
	int reversed = 0;
	System.out.print(" ");
	Scanner in = new Scanner(System.in);
	int  num = in.nextInt();
	while(num != 0) 
	{
     int digit = num % 10;
     reversed = reversed * 10 + digit;
     num /= 10;
    }
    System.out.println( reversed);
}
}
