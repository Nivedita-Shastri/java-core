package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
	public void search(int arr[],int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag=true;
				System.out.println("Element is Present");
			}
		}
		if(flag==false) {
		System.out.println("Element not found");
		
			}
		}
	public static void main(String[] args) {
		D09P03 l= new D09P03();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int k=0;k<n;k++) {
			arr[k]=sc.nextInt();
		}
		int key=sc.nextInt();
		l.search(arr, key);
		
	}

}
