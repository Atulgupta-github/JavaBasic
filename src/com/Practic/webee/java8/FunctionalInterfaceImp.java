package com.Practic.webee.java8;

public class FunctionalInterfaceImp {
	
	public static void main (String [] args) {
		Functional addition =(int a, int b)->{ System.out.println(a+b);	
		
		};
		
		addition.operation(3, 4);
	}
	
	
	
	
	
}

@FunctionalInterface
interface Functional{
	
	public void operation(int a, int b);
	
	/*default public void print() {
		
	}*/
	
}