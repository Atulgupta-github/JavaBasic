package com.java.designpattern.abstractfactorydesignpattern;

public class AndroideDev implements Employee {
	
	public int salary() {
		return 20000;
	}

	@Override
	public String name() {
		System.out.println("Andoride dev");
		return "Androide dev";
	}

}
