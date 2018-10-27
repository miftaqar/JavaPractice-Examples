package com.primetgi.org.threads.NameThreads;

public class NameThreadTest {

	public static void main(String[] args) {

		System.out.println("Current Running Thread: "+Thread.currentThread().getName());

		NameThreadTest test = new NameThreadTest();
		test.displayMsg();

		NameRunnable nr = new NameRunnable();

		Thread t = new Thread(nr);
		Thread t1 = new Thread(nr);

		t.setName("Mohammed");
		t.start();

		t1.setName("Ifteqar");
		t1.start();

	}

	public void displayMsg() {
		System.out
				.println("Message From Main class and from displayMsg method and the thread name is : "
						+ Thread.currentThread().getName());
	}

}
