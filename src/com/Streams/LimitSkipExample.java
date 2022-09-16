package com.Streams;

import java.util.Arrays;
import java.util.List;

public class LimitSkipExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","orange","graphes","banana","jerry");
		
		fruits.stream().limit(4).forEach(System.out::println);
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8);
		int sum =list.stream().limit(5).reduce(0, (x,y)->x+y);
		System.out.println("Limit sum: "+sum);
		
		int skip =list.stream().skip(5).reduce(0, (x,y)->x+y);
		System.out.println("skip sum: "+skip);
	}

}


