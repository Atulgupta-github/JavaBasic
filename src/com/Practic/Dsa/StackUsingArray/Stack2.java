package com.Practic.Dsa.StackUsingArray;

public class Stack2 {

	public static void main(String[] args) {
		Stack1 s= new Stack1(10);
		
		s.push(12);
		s.push(13);
		s.push(20);
		System.out.println(s.pop());
		for(int i=0;i<s.size()-1;i++) {
			System.out.println(s.pop());
		}
		
		

	}

}


class Stack1{
	int pos;
	int arr[];
	int cap;
	Stack1(int c){
		cap=c;
		pos=-1;
		arr=new int[c];
	}
	
	
	
	void push(int x) {
		pos++;
		arr[pos]=x;
		
	}
	
	
	int pop() {
		int temp=arr[pos];
		pos--;
		return  temp;
	}
	
	boolean isEmpty() {
		return pos==-1;
	}
	
	int size() {
		return pos+1;
	}
}