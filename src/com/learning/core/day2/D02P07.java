package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("");
		float per = input.nextFloat();
		if(per>=60)
			System.out.println("Grade A");
		else if(per>=45)
			System.out.println("Grade B");
		else if(per>=35)
			System.out.println("Grade C");
		else 
			System.out.println("Fail");
		
			
}
}