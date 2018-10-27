package com.primetgi.org.threads.overloadRun;

public class ExtentableClass extends Thread {

	public void run() {
		System.out.println("From Run Method");
	}
	
	
	public void run(String s) {
		System.out.println("From Run method with messgae to :"+s);
	}
}
