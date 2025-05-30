package com.Practic.webee;

public class StackImp {
	public static void main(String [] args) {
		Stack s = new Stack(10);
		s.push(12);
		s.push(23);
		s.push(32);
		s.push(2);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	}

}
class Stack{
	int arr[];
	int top;
	int cap;
	Stack(int c){
		cap=c;
		top=-1;
		arr= new int[c];
	}
	
	
	
	void push(int x) {
		top++;
		arr[top]=x;
	}
	
	
	int pop() {
		int temp =arr[top];
		top--;
		return temp;
	}
	
	
	int peak() {
		return arr[top];
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return top==-1;
	}
}