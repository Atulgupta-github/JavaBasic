package com.javabasic.Java8Features;


public class SingleParamLambdaExpressionImp {
	public static void main(String [] args) {
		SingleParameter s =(int a)->System.out.println(a*a*a);
		s.volume(6);
		s.displayMode();
	}
}


interface SingleParameter{
	void volume(int x);
	
	default void displayMode() {
		System.out.println("Single parameter lamda expression ");
	}
}