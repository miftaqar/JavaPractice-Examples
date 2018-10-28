package com.primetgi.org.threads.threadPriority;

public class YieldExample {

	public static void main(String[] args) {

		Thread t = new Thread(new Producer_Yield());
		Thread t1 = new Thread(new Consumer_Yield());

		t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);

		t.start();
		t1.start();

	}

	/*
	 * Yield means currently executing thread gives chance to the threads that have
	 * equal priority in the Thread-pool.Yield does not guarantee that it will
	 * change the state of the currently executing thread to runnable state
	 * immediately.
	 */
}
