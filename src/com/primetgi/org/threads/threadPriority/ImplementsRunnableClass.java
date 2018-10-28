package com.primetgi.org.threads.threadPriority;

public class ImplementsRunnableClass implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i <=5; i++) {
			Thread t = Thread.currentThread();
			System.out.println(Thread.currentThread().getName() +" in control");
			System.out.println(Thread.currentThread().getName() +" Is Alive: " +t.isAlive() );
		}
	}

}
