package com.learning.core.day8;

import java.util.Scanner;

public class D08P05 {
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	
	
	public D08P05(int n) {
	this.n=n;
	arr=new int[n];
		
	}
	public boolean isFull()
	{
		return rear==n-1;
	}
	public boolean isEmpty()
	{
		return rear==-1 && front==-1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else if(isEmpty()) {
			rear=front=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else if (front ==rear){
			int top=arr[front];
			front=rear=-1;
			return top;
			}
		else {
			int top=arr[front];
			front++;
			return top;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int top=arr[front];
			return top;
		}
		}
public void display() {
        
	 for (int i = this.front; i <= this.rear; i++) {
         System.out.print(arr[i]+" " );
	 }
	 
	 System.out.println();
}    
 

public static void main(String[] args) {
	D08P05 q=new D08P05(7);
	D08P05 arrq[]=new D08P05[2];
	D08P05 evenq=new D08P05(7);
	D08P05 oddq=new D08P05(7);
	arrq[0]=oddq;
	arrq[1]=evenq;
	Scanner sc = new Scanner(System.in);
    for(int i=0;i<=6;i++) {
    	q.enqueue(sc.nextInt());
    }
	
	while(!q.isEmpty())
	{
		int data= q.dequeue();
		if(data%2==0) {
			evenq.enqueue(data);
		}
		else {
			oddq.enqueue(data);
		}
	}
	System.out.print("Odd Queue:");
	oddq.display();
	System.out.print("Even Queue:");
	evenq.display();
	
	
	}
}