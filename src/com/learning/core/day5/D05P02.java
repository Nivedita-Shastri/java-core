package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("Jack");
		list.add("Paul");
		list.add("Henry");
		list.add("Mary");
		list.add("Ronaldo");
		 Scanner sc=new Scanner(System.in);
		 String seachName= sc.nextLine();
		 if(list.contains(seachName)) {
			 System.out.println("Found");
			 
		 }else {
			 System.out.println("not found");
		 }
	}

}
