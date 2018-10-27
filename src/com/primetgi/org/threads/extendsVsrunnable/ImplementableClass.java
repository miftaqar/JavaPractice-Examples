package com.primetgi.org.threads.extendsVsrunnable;

public class ImplementableClass implements Runnable{

	private int counter = 1;
	@Override
	public void run() {
		counter++;
		System.out.println("Implements Runnable : Counter " +counter);
		
	}

}
