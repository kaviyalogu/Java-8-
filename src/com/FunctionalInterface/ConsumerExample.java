package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static List<Emp> l = new ArrayList<>(); 
	static Consumer<Emp> con = e ->System.out.println(e.getName().toUpperCase());
	public static void main(String[] args) {

		
		//Consumer<Emp> c = s -> System.out.println(s.toUpperCase());
		//c.accept("kaviya");
		//Consumer<Emp> c1 = (s) -> System.out.println(s.toLowerCase());
		//c1.accept("KAVIYA");
		
		//c.andThen(c1).accept("Consumer EXAMPLE");
		l.add(new Emp("Kaviya", 23, 80000, "Tester", "female"));
		l.add(new Emp("logu", 43, 10000, "Developer", "male"));
		l.add(new Emp("gokul", 17, 60000, "Tester", "male"));
		l.add(new Emp("viga", 8, 1000, "Tester", "female"));
		l.add(new Emp("mani", 31, 90000, "Tester", "female"));
		
		l.forEach(con);
		
	}

}
