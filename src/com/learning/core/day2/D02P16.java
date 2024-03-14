package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {
	public static void main(String args[])  
	{  
		 Scanner r = new Scanner(System.in);
		 System.out.println("");
		 int count= r.nextInt();
	     int n1=0,n2=1,n3,i;    
	     System.out.print(n1+" "+n2);   
	    
	     for(i=2;i<count;++i)    
	    {    
	    	 n3=n1+n2;    
	    	 System.out.print(" "+n3);    
	    	 n1=n2;    
	    	 n2=n3;    
	    }    

	}
}
