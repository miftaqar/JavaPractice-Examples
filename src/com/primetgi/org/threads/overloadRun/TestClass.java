package com.primetgi.org.threads.overloadRun;

public class TestClass {

	public static void main(String[] args) {
		ExtentableClass extentableClass = new ExtentableClass();
		RunnableClass runnableClass = new RunnableClass();

		Thread thread = new Thread(runnableClass);

		extentableClass.start();
		extentableClass.run("Hello World");

		thread.start();
		runnableClass.run("Universe");

		/*
		 * When overloading the run() method, it will be ignored by the Thread class and
		 * should be invoked by the Runnable classes
		 */
	}

}
