package com.primetgi.org.threads.multipleThreads;

public class NameRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 15; i++) {
			System.out.println("Thread Run By: "
					+ Thread.currentThread().getName() + " : i: " + i);
		}

	}

}
