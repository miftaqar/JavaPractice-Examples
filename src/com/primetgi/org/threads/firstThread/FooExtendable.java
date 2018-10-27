package com.primetgi.org.threads.firstThread;

public class FooExtendable extends Thread {

	public FooExtendable(int a) {
		System.out.println("From arg constructor");
	}
	
	public FooExtendable() {
		System.out.println("From Aon Arg Constructor");
	}

	public void run() {
		System.out.println("From FooExtendable Class, Thread Specific Code");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Foo Running From Extendable");
		}
	}

}
