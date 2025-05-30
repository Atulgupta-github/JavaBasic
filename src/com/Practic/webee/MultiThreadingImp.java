package com.Practic.webee;



public class MultiThreadingImp {

	public static void main(String[] args) {
		ThreadA th = new ThreadA();
		
		ThreadB b = new ThreadB();
		Thread th1= new Thread(th);
		Thread thb= new Thread(b);
		th1.start();
		thb.start();
		

	}

}

class ThreadA implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class ThreadB implements Runnable{
	
	public void run() {
		for(int i=0;i<6;i++) {
			
			try {
				System.out.println(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}