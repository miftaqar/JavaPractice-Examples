package com.primetgi.org.threads.excercise13_1;

public class ThredMainClass {

	public static void main(String[] args) {
		 
		ThreadImplementationClass class1 = new ThreadImplementationClass();
		
		Thread t1 = new Thread(class1);
		Thread t2 = new Thread(class1);
		
		t1.setName("Mohammed");
		t2.setName("Ifteqar");
		
		t1.start();
		t2.start();

	}

}
