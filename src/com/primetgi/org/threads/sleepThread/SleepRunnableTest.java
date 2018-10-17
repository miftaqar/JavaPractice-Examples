package com.primetgi.org.threads.sleepThread;

public class SleepRunnableTest {

	public static void main(String[] args) {
		SleepRunnable sleepRunnable = new SleepRunnable();
		
		Thread t1 = new Thread(sleepRunnable);
		Thread t2 = new Thread(sleepRunnable);
		Thread t3 = new Thread(sleepRunnable);
		
		t1.setName("Mohammed");
		t2.setName("Ifteqar");
		t3.setName("Ahmed");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
