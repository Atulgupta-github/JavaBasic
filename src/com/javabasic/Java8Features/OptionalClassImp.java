package com.javabasic.Java8Features;

import java.util.Optional;


/*What is Optional Class in Java 8?
In Java 8, Optional Class is a container object.

The Optional class used to represent a value that may be present or may not be.
This class helps in avoiding null pointer exceptions by providing methods to check the presence of a value before accessing it.
This helps null values handling more effectively.*/



public class OptionalClassImp {

	public static void main(String[] args) {
		
		
		String arr[]  = new String[10];
		
		String word= arr[5];
		
		// giving null pointer exception
		//System.out.println(word.toString());
		
		Optional<String> str= Optional.ofNullable(word);
		if(str.isPresent()) {
			System.out.println(str.toString());
			
		}else {
			System.out.println("data is null");
		}
		

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