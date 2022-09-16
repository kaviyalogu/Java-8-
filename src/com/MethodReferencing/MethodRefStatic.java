package com.MethodReferencing;

import java.util.Comparator;

public class MethodRefStatic {

	
	// classname :: static method name -> refers to static method
	// obj :: method name -> refers to instance method
	// classname :: new -> refers to constructor
	
	public static void main(String[] args) {

		System.out.println("Before java 8 :"+MethodRefStatic.comparemethod(10, 5));
		Comparator<Integer> com = MethodRefStatic :: comparemethod;
		System.out.println("In java 8 :"+com.compare(20, 30));
		Comparator<Integer> com1 = (a,b) -> comparemethod(a, b);
		System.out.println("Using lambda :"+com1.compare(20, 20));
	}
	
	public static int comparemethod(Integer a, Integer b){
		return Integer.compare(a, b);
		
	}

}
