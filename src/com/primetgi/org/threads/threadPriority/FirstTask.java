package com.primetgi.org.threads.threadPriority;

public class FirstTask implements Runnable {

	@Override
	public void run() {
		System.out.println("First Task Started");
		System.out.println("Sleeping for 2 Secs");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("First Task Completed");
	}

}
