package com.primetgi.org.threads.firstThread;

public class TestThreads {

	public static void main(String[] args) {
		
		//Instantiating Runnable Class
		FooRunnable fr = new FooRunnable();
		FooExtendable fe = new FooExtendable();
			
		
		//Defining the thread, and passing the runnable instance to Thread class
		Thread thread = new Thread(fr);
		//Thread thread2 = new Thread(fr);
		
		Thread thread3 = new Thread(fe);
		
		//Starting the thread
		
		//thread.start();
		//thread2.start();
		
		thread3.start();
		
	}

}
