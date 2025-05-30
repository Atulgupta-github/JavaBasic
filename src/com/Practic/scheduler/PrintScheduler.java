package com.Practic.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PrintScheduler {
	
	PrintSchedulerService pservice= new PrintSchedulerService();
	public void init() {
		
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		Runnable task =()->{
			pservice.printData();
		};
		scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
	}

}
