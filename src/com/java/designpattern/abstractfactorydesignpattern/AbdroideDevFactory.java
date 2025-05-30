package com.java.designpattern.abstractfactorydesignpattern;

public class AbdroideDevFactory extends EmployeeAbstractFactory  {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroideDev();
	}

}
