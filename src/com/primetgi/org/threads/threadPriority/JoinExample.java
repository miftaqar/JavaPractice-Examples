package com.primetgi.org.threads.threadPriority;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new FirstTask());
		Thread t0 = new Thread(new FirstTask());
		Thread t1 = new Thread(new SecondTask());
		
		t.start();
		t.join();
		t0.start();
		t0.join(1500);
		t1.start();
		
	}

}
