package com.javabasic.sita.practice;

public class MultiThreadingImp {
	public static void main(String []args) {
		Thread1 th1 = new Thread1();
		Thread t = new Thread(th1);
		t.start();
	}
}


class Thread1 implements Runnable{
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(3000);
				System.out.println(i);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}