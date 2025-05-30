package com.java.designpattern.abstractfactorydesignpattern;

public class WebDevFactory  extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDev();
	}

}
