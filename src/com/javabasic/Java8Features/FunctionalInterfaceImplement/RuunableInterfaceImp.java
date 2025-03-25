package com.javabasic.Java8Features.FunctionalInterfaceImplement;

/*java.lang.Runnable is an interface that is to be implemented by a class whose instances are intended to be executed by a thread. 
There are two ways to start a new Thread – Subclass Thread and implement Runnable. 
There is no need to subclass a Thread when a task can be done by overriding only the run() method of Runnable.*/


public class RuunableInterfaceImp {
	public static void main(String [] args) {
		
		
		Test t = new Test();
		
		Thread th = new Thread(t);
		th.start();
	}
}


class Test implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<14;i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}