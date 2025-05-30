package com.Practic.webee;

public class FunctionalInterfaceImp {
	public static void main(String args[]) {
		
		
		Print p =()->{
			System.out.println("Zero prameter function interface");
		};
		
		p.printZeroParameterFI();
		p.print();
		
		
		Square s =(int x)->{
			System.out.println(x*x);
		};
		s.printSingleParameter();
		s.calculeSquare(10);
	}

}



@FunctionalInterface
interface Print{
	void print();
	
	default void printZeroParameterFI() {
		System.out.println("Zero prameter function interface");
	}
	
}

@FunctionalInterface
interface Square{
	
	void calculeSquare(int side);
	
	default void printSingleParameter() {
		System.out.println("Single parameter F I ");
	}
	
}

