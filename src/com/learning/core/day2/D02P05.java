package com.learning.core.day2;

import java.util.Scanner;

public class D02P05 {
	public static void main(String[] args)
    {
        
		 Scanner r = new Scanner(System.in);
		 System.out.println("");
		 double n= r.nextDouble();
 
       
        if (n % 5 == 0)
 
          
            System.out.println("The number is divisible by 5");
        else
 
            
            System.out.println("The number is not divisible by 5");
    }

}
