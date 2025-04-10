package com.javabasic.sita.practice;

public class StackImp {

	public static void main(String[] args) {
		Stack st = new Stack(10);
		st.push(2);
		st.push(4);
		st.push(6);
		st.push(8);
		
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.size());
		System.out.println(st.isEmpty());

	}

}
class Stack{
	int arr[];
	int top;
	int cap;
	Stack(int c){
		arr=new int[c];
		top=-1;
		cap=c;
	}
	
	
	void push(int x) {
		top++;
		arr[top]=x;
		
	}
	
	int pop() {
		int temp=arr[top];
		top--;
		return temp;
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	int peek() {
		return arr[top];
	}
	
	int size() {
		return top+1;
	}
	
	
	
}