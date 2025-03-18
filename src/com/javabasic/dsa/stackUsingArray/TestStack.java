package com.javabasic.dsa.stackUsingArray;

public class TestStack {

	public static void main(String[] args) {
		MyStack st = new MyStack(5);
		st.push(10);
		st.push(4);
		st.push(1);
		System.out.println(st.pop());
		System.out.println(st.peak());
		System.out.println(st.isEmpty());
		System.out.println(st.size());

	}

}

class MyStack{
	int arr[];
	int cap;
	int top;
	
	MyStack(int c){
		cap=c;
		top=-1;
		arr = new int[cap];
	}
	
	void push(int x) {
		top++;
		arr[top]=x;
	}
	
	int pop() {
		int res= arr[top];
		top--;
		return res;
	}
	
	int peak() {
		return arr[top];
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	int size() {
		return top+1;
	}
}