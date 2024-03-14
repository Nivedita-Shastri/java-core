package com.learning.core.day2;

import java.util.Scanner;

public class D02P02 {
	public static void main(String args[])
	{
		Scanner r = new Scanner(System.in);
		int num = r.nextInt();
		System.out.println("");
		for(int i=1;i<=num;i++)
		{
			if((i%2)==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
