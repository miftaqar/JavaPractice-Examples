package com.primetgi.org.threads.extendsVsrunnable;

public class RunnableVsExtend {

	public static void main(String[] args) throws InterruptedException {

		ImplementableClass implementableClass = new ImplementableClass();

		// Multiple thread shares the same object
		Thread t1 = new Thread(implementableClass);
		t1.start();
		Thread.sleep(1000);
		Thread t2 = new Thread(implementableClass);
		t2.start();
		Thread.sleep(1000);
		Thread t3 = new Thread(implementableClass);
		t3.start();

		// creating a new instance for every Thread class
		ExtendableThread et1 = new ExtendableThread();
		et1.start();
		Thread.sleep(1000);
		ExtendableThread et2 = new ExtendableThread();
		et2.start();
		Thread.sleep(1000);
		ExtendableThread et3 = new ExtendableThread();
		et3.start();
		Thread.sleep(1000);
	}

	/*
	 * In the Runnable interface approach, only one instance of a class is being
	 * created and it has been shared by different threads. So the value of counter
	 * is incremented for each and every thread access.
	 * 
	 * Whereas, Thread class approach, you must have to create separate instance for
	 * every thread access. Hence different memory is allocated for every class
	 * instances and each has separate counter, the value remains same, which means
	 * no increment will happen because none of the object reference is same.
	 */
}
