package com.Practic.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrintSchedulerService {

	
	public void printData() {
		ExecutorService secondaryThreadPool = Executors.newFixedThreadPool(2);
		
		Callable<String> call =()->{
			
			print();
			return "Complete";
		};
		
		Future<String> future = secondaryThreadPool.submit(call);
	}
	
	
	public void print() {
		System.out.println("Hello");
	}
	
	
}
