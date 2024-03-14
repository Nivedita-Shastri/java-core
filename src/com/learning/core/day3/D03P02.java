package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num1=3,num2=29;
	      boolean found = false;
	      int[] array = {7,25,5,19,30};
			for (int i = 0; i < array.length; i++) {
	            if (num1 == array[i] && num2 == array[i]) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }
	}



