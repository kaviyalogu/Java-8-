package com.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultipleCatchFinally extends Exception{

	public static void main(String[] args) {

		/*try{
		int a = 10;
		//int b = a/0; 
		//System.out.println(b);
		int[] arr ={1,3,4,5,6};
		//System.out.println(arr[10]);
		Class c1 = Class.forName("kaviya");
		System.out.println(c1.getClassLoader());
		}catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("thank u");
		}*/
		
		/*Integer[] arr ={1,3,4,5,6};
		List l1 = Arrays.asList(1,2,3,4,5);
		
		
		List l2 = Arrays.asList(arr);
		System.out.println(l2.toString());
		
		
		List l =new ArrayList<>(Arrays.asList(arr));
		Collections.addAll(l, arr);
		System.out.println(l.toString());
		
		Integer[] a = (Integer[]) l1.toArray(new Integer[0]);
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));*/
		
		List<Integer> l = Arrays.asList(1,2,3,1,2,3);
		System.out.println(l);
		Set<Integer> s = new HashSet<>();
		s.addAll(l);
		Set<Integer> s1 = new HashSet<>(l);
		System.out.println(s1);
		System.out.println(s);
		
	}

}
