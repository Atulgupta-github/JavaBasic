package com.javabasic.multithreding;



public class MultiThreadingOperation {

	public static void main(String[] args) {
		
	//	switchcaseimp();
		Thread1 th1 = new Thread1();
		Thread2 th2= new Thread2();
		
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		//t1.setDaemon(true);
		t2.start();
		//t1.setDaemon(true);
		//System.out.println(t1.isDaemon());

	}
	public static void switchcaseimp() {
		String st ="atul";
		
		switch(st) {
		case "nitin":{
			System.out.println("nitin");
		}
		case "atul":{
			System.out.println("atil");
		}
		default:{
			System.out.println("hello");
		}
		}
	}

}

class Thread1 implements Runnable{
	
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("====Thread1=======");
			
			try {
				Thread.sleep(1000);
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("====Thread2=======");
			
			try {
				Thread.sleep(3000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}