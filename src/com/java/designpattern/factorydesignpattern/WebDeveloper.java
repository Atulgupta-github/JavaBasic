package com.java.designpattern.factorydesignpattern;

public class WebDeveloper  implements Employee{

	@Override
	public int salary() {
		System.out.println("webdeveloper salary:------");
		return 50000;
	}

}
