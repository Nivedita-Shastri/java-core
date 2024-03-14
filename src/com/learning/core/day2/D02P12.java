package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args)
	{
		int n;
		System.out.println("");
	    Scanner in = new Scanner(System.in);
	     n = in.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
