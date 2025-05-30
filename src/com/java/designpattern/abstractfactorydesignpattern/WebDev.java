package com.java.designpattern.abstractfactorydesignpattern;

public class WebDev  implements Employee{
	
	public int salary() {
		return 20000;
	}

	@Override
	public String name() {
		System.out.println("Web dev");
		return "Web dev";
	}

}
