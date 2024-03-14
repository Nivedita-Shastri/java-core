package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
	public static void main(String args[]){  
		  int i,fact=1,n;  
		  System.out.println("");
		  Scanner cap = new Scanner(System.in);
		  n = cap.nextInt();
		    
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is "+fact);    
		 }  

}
