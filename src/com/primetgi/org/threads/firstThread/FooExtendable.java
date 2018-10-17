package com.primetgi.org.threads.firstThread;

public class FooExtendable extends Thread {
	
	 public void run() {
		 System.out.println("From FooExtendable Class, Thread Specific Code");
			for(int i = 1; i <= 5; i ++) {
				System.out.println(i +". Foo Running");
			}
	 }
	 
}
