package com.learning.core.day3;
import java.util.Scanner;

public class D03P04 {
	public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++) 
        for(int j=i+1;j<n;j++) 
            if(arr[i]==arr[j])
              {
                System.out.println(arr[i]);
                temp=1;
                i=n;j=n;
              }
        if(temp==0)
        System.out.println("No repeating integer found");
    }

}
