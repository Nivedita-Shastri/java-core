package com.learning.core.day9;

import java.util.Scanner;

public class D09P01 {
	
	public int partition(int arr[],int lb,int ub)
	{
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		while(start<end) {
			start =start+1;
			while(start<=ub && arr[start]<pivot)
			{
				start++;
			}
			while(end>=lb && arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		return end;
	}

	public void quicksort(int arr[],int lb,int ub)
	{
		int loc;
		if(lb<ub)
		{
			loc =partition(arr,lb,ub);
			quicksort(arr,lb,loc-1);
			quicksort(arr,loc+1,ub);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int arr[]=new int[p];
		for(int i=0;i<p;i++) {
			arr[i]=sc.nextInt();
		}
		D09P01 q=new D09P01();
		int n=arr.length;
		q.quicksort(arr, 0, n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
			
		}
	}
}
