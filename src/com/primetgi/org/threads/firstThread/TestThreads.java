package com.primetgi.org.threads.firstThread;

public class TestThreads {

	public static void main(String[] args) {

		// Instantiating Runnable Class
		FooRunnable fr = new FooRunnable();
		FooExtendable fe = new FooExtendable(1);

		// Defining the thread, and passing the runnable instance to Thread class
		Thread thread = new Thread(fr);

		// Starting the thread on Thread instance, not on an Runnable Instance
		thread.start();

		/*
		 * when you create FooExtendable class object, Thread class constructor will
		 * also be invoked, as it is the super class, hence FooExtendable class object
		 * acts as Thread class object.
		 */
		fe.start();
	}

}
