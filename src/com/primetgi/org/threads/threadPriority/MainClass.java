package com.primetgi.org.threads.threadPriority;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.MAX_PRIORITY);

		ImplementsRunnableClass runnableClass = new ImplementsRunnableClass();

		Thread t = new Thread(new ImplementsRunnableClass());
//		Thread t = new Thread(runnableClass);

		t.start();
		t.setName("Runnable Thread - 1");
		t.setPriority(4);
		

		Thread t1 = new Thread(runnableClass);
		t1.setName("Runnable Thread -2");
		t.setPriority(4);
		t1.start();
		t.join(500);
		t1.join(1000);

		for (int i = 0; i <= 5; i++) {
			Thread.yield();

			System.out.println(Thread.currentThread().getName() + ": in control");
			System.out.println(Thread.currentThread().getName() +" Is Alive: " +t.isAlive() );
		}

	}

}
