package com.java.designpattern.sigleton.copy;

public class Bike {

	//3. CREATE PRRIVATE GLOBAL VARIABLE
	private static Bike  bike;
	
	//1. CREATE  PRIVATE CONSTRUCTOR
	private  Bike () {
		
	}
	
	// LAZY WAY
	
	//2, CREATE PUBLIC GET METHOD FOR GET THE OBJECT EVERY WHERE
	public static Bike getBike() {
		if(bike==null) {
			bike = new Bike();
		}
		return bike;
	}
}
