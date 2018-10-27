package com.primetgi.org.threads.overloadRun;

public class RunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method From Runnable Class");
	}
	
	public void run(String s) {
		System.out.println("Run Method with the message to the: "+s);
	}
}
