package com.Practic.Dsa.StackUsingArray;

public class StackImplementation {
	public static void main(String [] args) {
		
		Stack s = new Stack(15);
		s.push(1);
		s.push(3);
		s.push(7);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s.pop());
		System.out.println(s.size());
		
		
		
		
		
		
	}
}

class Stack{
	int arr[];
	int pos;
	int cap;
	Stack(int c){
		cap=c;
		pos=-1;
		arr= new int[c];
	}
	
	
	void push(int x) {
		pos++;
		arr[pos]=x;
	}
	
	int pop() {
		int temp= arr[pos];
		pos--;
		return temp;
	}
	
	boolean isEmpty() {
		return pos==-1;
	}
	
	int size() {
		return pos+1;
	}
}