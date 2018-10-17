package com.primetgi.org.threads.excercise13_1;

public class ThreadImplementationClass implements Runnable {

	@Override
	public void run() {

		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				System.out.println("Thread Run By : "+Thread.currentThread().getName());
				System.out.println(i + " divided by 100");
			}
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
