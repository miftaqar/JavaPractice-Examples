package com.primetgi.org.threads.threadPriority;

public class Producer_Yield implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<= 3; i++) {
			System.out.println("Prducer: Produced Item : "+i);
			Thread.yield();
		}
		
	}

}
