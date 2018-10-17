package com.primetgi.org.threads.sleepThread;

public class SleepRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread Run By: "
					+ Thread.currentThread().getName() + " : i: " + i);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
