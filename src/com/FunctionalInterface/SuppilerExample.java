package com.FunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;
import com.FunctionalInterface.EmpRepository;
public class SuppilerExample {

	public static void main(String[] args) {

		Supplier<Double> sup1 = () ->Math.random();
		System.out.println(sup1.get());
		
		Supplier<LocalDateTime> sup2 = () -> LocalDateTime.now();
		System.out.println(sup2.get());
		
		
		Supplier<Emp> sup3 = () ->EmpRepository.getEmp();
		System.out.println(sup3.get());
	}

}
