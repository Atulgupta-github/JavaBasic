package com.java.designpattern.sigleton.copy;

public class Test {
	public static void main(String args []) {
		
		Bike b1 = Bike.getBike();
		Bike b2 = Bike.getBike();
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		
	}

}
