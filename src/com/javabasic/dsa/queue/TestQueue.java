package com.javabasic.dsa.queue;


class Queue{
	int arr[];
	int size;
	int front;
	int rear;
	int cap;
	
	Queue(int c){
		cap=c;
		size=0;
		front=0;
		rear=cap-1;
		arr= new int[cap-1];
	}
	
	boolean isFull() {
		return size==cap;
	}
	boolean isEmpty() {
		return size==0;
	}
	
	void enQueue(int item) {
		if(isFull()) {
			return;
		}
		rear = (rear+1)%cap;
		arr[rear]=item;
		size++;
		
	}
	
	int deQueue() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int res= arr[front];
		front = (front+1)%cap;
		size--;
		return res;
		
	}
	
	int front () {
		return arr[front];
	}
	int rear() {
		return arr[rear];
	}
}









public class TestQueue {

	public static void main(String[] args) {
		Queue q= new Queue(5);
		q.enQueue(1);
		q.enQueue(3);
		q.enQueue(5);
		q.enQueue(7);
		System.out.println(q.front);
		System.out.println(q.rear);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		System.out.println(q.deQueue());
		System.out.println(q.front);

	}

}
