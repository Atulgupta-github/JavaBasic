package com.Practic.webee.java8;

public class LambdaExpressionImp {

	
	
	
	public static void main(String [] args) {
		
		//zero parameter 
		Car1 c = ()-> {
			System.out.println("start");
		};
		
		c.start();
		
		//one parameter 
		Operation op =(int x)->{
			System.out.println(x*x);
		};
		
		op.print();
		op.square(10);
		
		//Multiparameter lambda expression
		Multiparameter m = (int x, int y, int z)->{
			System.out.println(x*y*z);
		};
		
		m.printVolume();
		m.volume(2, 4, 6);
	}
	
}


interface Car1{
	public void start();
	
	default void stop() {
		System.out.println("stop");
	}
}

interface Operation{
	
	public void square(int a);
	
	default void print() {
		System.out.println("print square");
	}
}

interface Multiparameter{
	
	
	public void volume(int a, int b , int c);
	
	default void printVolume() {
		System.out.println("volume is ====");
	}
}