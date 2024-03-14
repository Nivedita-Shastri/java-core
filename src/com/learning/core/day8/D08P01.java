package com.learning.core.day8;

public class D08P01 {
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	
	
	public D08P01(int n) {
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
         System.out.print(arr[i] + " ");
     }
     System.out.println();
}

public static void main(String[] args) {
	D08P01 q=new D08P01(4);
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	System.out.print("Elements in the Queue:");
	q.display();
	q.dequeue();
    System.out.print("After deleting element:");
	q.display();

	
	}
}