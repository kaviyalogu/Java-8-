package com.runnable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		List<Emp> l = new ArrayList<>();
		
		l.add(new Emp("Kaviya","logu",30000));
		l.add(new Emp("vigashini","pandi",30000));
		l.add(new Emp("gokul","pandiyan",30000));
		
		Comparator<Emp> c = (e1,e2) ->e1.getFirstName().compareTo(e2.getFirstName());
		System.out.println(l.toString());
		Collections.sort(l, c);
		System.out.println();
		
		
	}
	
		
		
}
