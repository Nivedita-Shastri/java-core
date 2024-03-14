package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
	 public static void main(String[] args) {

	       
		 Scanner r = new Scanner(System.in);
		 System.out.println("");
		 double n1= r.nextDouble();
		 double n2= r.nextDouble();
		 double n3= r.nextDouble();

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1);

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2);

	        else
	            System.out.println(n3);
	    }

}
