package com.learning.core.day8;

	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Queue {
	    private Node front, rear;

	    public Queue() {
	        this.front = this.rear = null;
	    }

	    public void enqueue(int data) {
	        Node newNode = new Node(data);

	        if (isEmpty()) {
	            front = rear = newNode;
	            return;
	        }

	        rear.next = newNode;
	        rear = newNode;
	    }

	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }

	        front = front.next;

	        if (front == null) {
	            rear = null;
	        }
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }

	        Node temp = front;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	}

	public class D08P02 {
	    public static void main(String[] args) {
	        Queue queue = new Queue();

	        queue.enqueue(89);
	        queue.enqueue(99);
	        queue.enqueue(109);
	        queue.enqueue(209);
	        queue.enqueue(309);

	        System.out.print("Elements in queue: ");
	        queue.display();

	        queue.dequeue();
	        queue.dequeue();

	        System.out.print("After removing two elements: ");
	        queue.display();
	    }
	}



