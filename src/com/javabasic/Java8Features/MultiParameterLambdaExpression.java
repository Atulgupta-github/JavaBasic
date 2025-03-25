package com.javabasic.Java8Features;

public class MultiParameterLambdaExpression {

	public static void main(String[] args) {
		
		MultiParameter add = (int x, int y)->System.out.println(x+y);
		add.operation(4, 5);
		MultiParameter multyPly= (int x,int y)-> System.out.println(x*y);
		multyPly.operation(4, 5);
	}

}
interface MultiParameter{
	void operation(int a, int b);
	
	default void print() {
		System.out.println("MultiParameter Lambda expression");
	}
}