package com.Practic.webee.java8;




public class defaultMethodImp  {
	public static void main(String [] args) {
		
		Carimp c = new Carimp();
		c.start();
		c.stop();
	}
	

}

interface car{
	public void start();
	
	default void stop() {
		System.out.println("stop======");
	}
}

class Carimp implements car{
	
	public void start() {
		System.out.println("start====");
	}
}