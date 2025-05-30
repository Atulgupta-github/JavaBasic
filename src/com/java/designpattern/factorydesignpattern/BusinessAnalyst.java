package com.java.designpattern.factorydesignpattern;

public class BusinessAnalyst implements Employee{

	@Override
	public int salary() {
		System.out.println("BA --SALARY");
		return 40000;
	}
	

}
