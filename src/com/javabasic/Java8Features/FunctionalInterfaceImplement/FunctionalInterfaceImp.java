package com.javabasic.Java8Features.FunctionalInterfaceImplement;


/*Functional Interfaces
 * An interface that contains only one abstract method is known as a functional interface, 
but there is no restriction, 
you can have n number of default and static methods inside a functional interface.*/

/*Runnable, ActionListener, and Comparator are common examples of Java functional interfaces.
From Java 8 onwards, 
lambda expressions and method references can be used to represent the instance of a functional interface.*/


public class FunctionalInterfaceImp {

	public static void main(String[] args) {
		Bike c = new Bike();
		c.display();
		c.run();

	}

}

interface funinterface{
	void run();
	
	default void display() {
		System.out.println("Hello this is default method");
	}
	
}

class Bike implements funinterface{

	
	public void run() {
		System.out.println("Runn");
	}
	
}
