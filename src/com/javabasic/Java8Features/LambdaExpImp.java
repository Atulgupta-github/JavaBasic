package com.javabasic.Java8Features;

public class LambdaExpImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcInterface f = (int x)->System.out.println(x*x);
		
		f.square(5);
		f.print();
		

	}

}


interface funcInterface{
	
	void square(int x);
	
	
	default void print() {
		System.out.println("Hello word");
	}
	
}

/*Lambda expressions in Java, introduced in Java SE 8, 
 * represent instances of functional interfaces (interfaces with a single abstract method).
 *  They provide a concise way to express instances of single-method interfaces using a block of code.
Functionalities of Lambda Expression
Lambda Expressions implement the only abstract function and therefore implement functional interfaces lambda expressions are added in Java 8 and provide the below functionalities.*/