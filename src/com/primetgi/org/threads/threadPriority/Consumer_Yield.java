package com.primetgi.org.threads.threadPriority;

public class Consumer_Yield implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Consumer: Consumed Item : " + i);
			Thread.yield();
		}

	}

}
