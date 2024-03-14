package com.learning.core.day8;

import java.util.Scanner;

class ArrayQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(String data) {
        if (isFull()) {
            //System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        queue[rear] = data;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }
}

public class D08P04 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        Scanner sc = new Scanner(System.in);
        String in =sc.nextLine();
        if (in.equals("[]")) {
            System.out.println("Empty");
        } else {
        	for(int i=0;i<=5;i++) {
            	queue.enqueue(sc.nextLine());
            }
            System.out.println("Not empty");
        }
   }
}
