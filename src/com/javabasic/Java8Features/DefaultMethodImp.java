package com.javabasic.Java8Features;

/*What is Default Methods In Java 8?
 * 
 * 
In Java 8, Default methods allows interfaces to have method implementations. 
This means that interfaces can contain concrete methods along with the abstract methods. 
The Default methods are defined using the default keyword.*/
public class DefaultMethodImp {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start(5);
		c.stop();

	}

}

interface vachile{
	// abstract method
	void start(int x); 
	
	
	default void stop() {
		System.out.println("hello , this stop is default method");
	}
	
}


class Car implements vachile{

	@Override
	public void start(int x) {
		System.out.println("This starts is abstact method ");
		
	}
	
}


/*Java 8 Features
Lambda Expressions
Functional Interfaces
Method Reference
Streams
Comparable and Comparator
Optional Class
Date/Time API
Miscellaneous*/