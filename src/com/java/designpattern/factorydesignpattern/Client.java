package com.java.designpattern.factorydesignpattern;

public class Client {

	public static void main(String args[]) {
	
		//Employee e = new WebDeveloper();
		
		Employee e = EmployeeFactory.getEmployee("WeBDEV");
		System.out.println(e.salary());
		Employee e1 = EmployeeFactory.getEmployee("ba");
		System.out.println(e1.salary());
		
	}
}
