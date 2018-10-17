package com.primetgi.org.threads.firstThread;

public class FooRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("From FooRunnable Class, Thread Specific Code");
		for(int i = 1; i <= 5; i ++) {
			System.out.println(i +". Foo Running");
		}
		
	}

}
