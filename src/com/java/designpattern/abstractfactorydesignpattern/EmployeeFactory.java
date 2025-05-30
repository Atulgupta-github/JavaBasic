package com.java.designpattern.abstractfactorydesignpattern;

public class EmployeeFactory {
	
	
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}

}
