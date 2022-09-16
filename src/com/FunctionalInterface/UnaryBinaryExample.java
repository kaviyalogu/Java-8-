package com.FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {

	public static void main(String[] args) {

		UnaryOperator<String> uo1 = s -> s.toUpperCase();
		UnaryOperator<Integer> uo2 = s -> s*s;
		System.out.println(uo1.apply("kaviya"));
		System.out.println(uo2.apply(10));
		
		BinaryOperator<String> bo1 = (a,b) -> a.concat(b);
		System.out.println(bo1.apply("kaviya", "logu"));
		
		BinaryOperator<Integer> bo2 = (a,b) -> a+b;
		System.out.println(bo2.apply(5,7));
		
		Comparator<Integer> com = (a,b) -> a.compareTo(b);
		BinaryOperator<Integer> bo3 = BinaryOperator.maxBy(com);
		System.out.println("Max by: "+bo3.apply(20, 10));
		
		BinaryOperator<Integer> bo4 = BinaryOperator.minBy(com);
		System.out.println("Min by: "+bo4.apply(20, 10));
		
		
		
	}

}
