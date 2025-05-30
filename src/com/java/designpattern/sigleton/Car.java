package com.java.designpattern.sigleton;

public class Car {
	
	private static Car car = new Car(); 
	
	private Car() {
		
	}
	
	
	public static Car getCar() {
		return car;
	}
}
