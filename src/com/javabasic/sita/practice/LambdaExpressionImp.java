package com.javabasic.sita.practice;

public class LambdaExpressionImp {
	public static void main(String [] args) {
		
		Square s = (int a,int b)->System.out.println(a*b);
		s.area(4, 5);
		s.display();
		
	}
}


interface Square{
	void area(int l,int b);
	
	default void display() {
		System.out.println("hello");
	}
}