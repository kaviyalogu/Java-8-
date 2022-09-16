package com.runnable;

import java.util.Comparator;

public class ThreadExample {

	public static void main(String[] args) {

		Runnable r =()->System.out.println("Thread 1");
		new Thread(r).start();
	

	    new Thread(()->{
	    	System.out.println("Thread 2");
	    }).start();
	    
	    Comparator<Integer> c =(a,b)->a.compareTo(b);
	    System.out.println(c.compare(10, 10));
	}
}
