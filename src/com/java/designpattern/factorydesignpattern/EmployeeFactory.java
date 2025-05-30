package com.java.designpattern.factorydesignpattern;

public class EmployeeFactory {
	
	
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("WEbDEV")) {
			return new WebDeveloper();
		}else if(empType.trim().equalsIgnoreCase("BA")) {
			return new BusinessAnalyst();
		}else {
			return null;
		}
	}

}
