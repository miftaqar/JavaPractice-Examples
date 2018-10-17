package com.primetgi.org.threads.NameThreads;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Name Runnable Class Running");
		System.out.println("Run By: "+ Thread.currentThread().getName());
		
	}

}
