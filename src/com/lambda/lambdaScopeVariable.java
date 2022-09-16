package com.lambda;

import java.util.function.Consumer;

public class lambdaScopeVariable {
   static String first ="viga";
	public static void main(String[] args) {

		String name = "logu";
		
		Consumer<String> c = n ->{
			System.out.println("name :"+name);
			System.out.println("inside variable n :"+n);
			//name = "kavin"; -> Local variable name defined in an enclosing scope must be final or effectively final
			System.out.println("changing local variable name :"+name.concat("kavin"));
			first = "shini";
			System.out.println("global variable first :"+first);
		};
		c.accept("mani");
	}

}
