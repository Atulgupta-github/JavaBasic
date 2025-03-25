package com.javabasic.Java8Features;

public class ZeroParamLambdaExpImp {
	public static void main(String [] args) {
		
		FunctionalInterface print= ()->System.out.println("Zero parameter lambda expression");
		
		print.display();
		
		
		
	}
}


interface FunctionalInterface{
	
	void display();
}