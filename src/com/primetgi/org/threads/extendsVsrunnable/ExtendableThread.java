package com.primetgi.org.threads.extendsVsrunnable;

public class ExtendableThread extends Thread {

	private int counter = 1;

	public void run() {
		counter++;
		System.out.println("Implements Extends Thread: Counter: "+counter);
	}
}
