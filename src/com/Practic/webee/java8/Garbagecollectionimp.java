package com.Practic.webee.java8;

public class Garbagecollectionimp {
	
	
	public Garbagecollectionimp(String string) {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		Garbagecollectionimp g1=new Garbagecollectionimp("obj1");
		Garbagecollectionimp g2 =new Garbagecollectionimp("obj2");
		
		g1=null;
		
		try {
			System.gc();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
