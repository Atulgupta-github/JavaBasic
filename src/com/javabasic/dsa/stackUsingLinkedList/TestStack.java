package com.javabasic.dsa.stackUsingLinkedList;

class Node{
	int data ;
	Node next;
	Node(int x){
		data= x;
		next = null;
	}
}

class MyStack{
	Node head;
	int size;
	
	public MyStack() {
		head =null;
		size=0;
		
	}
	
	boolean isEmpty() {
		return (head == null);
	}
	
	int size() {
		return size;
	}
	
	
	void push(int x) {
		Node temp = new Node(x);
		temp.next= head;
		head=temp;
		size++;
	}
	
	int pop() {
		if(head == null) {
			return Integer.MAX_VALUE;
		}
		int res =head.data;
		head= head.next;
		size--;
		return res;
	}
	int peek() {
		if(head == null) {
			return Integer.MAX_VALUE;
		}
		return head.data;
		
	}
}


public class TestStack {
	public static void main(String [] args) {
		MyStack st = new MyStack();
		st.push(10);
		st.push(20);
		System.out.println(st.size());
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		
	}
}
