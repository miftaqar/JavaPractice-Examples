package com.primetgi.org.threads.multipleThreads;

public class NameRunnableTest {

	public static void main(String[] args) {
		
		NameRunnable nameRunnable = new NameRunnable();
		
		Thread t1 = new Thread(nameRunnable);
		Thread t2 = new Thread(nameRunnable);
		Thread t3 = new Thread(nameRunnable);
		
		t1.setName("Mohammed");
		t2.setName("Ifteqar");
		t3.setName("Ahmed");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
