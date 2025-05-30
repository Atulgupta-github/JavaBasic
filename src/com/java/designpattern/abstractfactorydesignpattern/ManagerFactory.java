package com.java.designpattern.abstractfactorydesignpattern;

public class ManagerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Manager();
	}

}
