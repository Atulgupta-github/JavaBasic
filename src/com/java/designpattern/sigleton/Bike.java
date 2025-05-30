package com.java.designpattern.sigleton;

import java.io.Serializable;

public class Bike  implements Serializable{

	//3. CREATE PRRIVATE GLOBAL VARIABLE
	private static Bike  bike;
	
	//1. CREATE  PRIVATE CONSTRUCTOR
	private  Bike () {
		/*if(bike!= null) {
			throw new RuntimeException("you are break the single pattern");
		}*/
		
	}
	
	// LAZY WAY of creating singleton object 
	// it is not good way for threadsefty
	//2, CREATE PUBLIC GET METHOD FOR GET THE OBJECT EVERY WHERE
	public static Bike getBike() {
		if(bike==null) {
			bike = new Bike();
		}
		return bike;
	}
	
	
	// thread safe environement
	public static Bike getTheBike() {
		
		if(bike==null) {
			synchronized(Bike.class) {
				if(bike==null) {
					bike=new Bike();
				}
			}
		}
		
		
		return bike;
	}
	
	public Object readResolve() {
		return bike;
	}
}
