package com.imonichris.myjavalearning.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	static Function<String, String> toUppercase = s -> s.toUpperCase();
	//using method reference
	static Function<String, String> toUppercase2 = String::toUpperCase;
	
	public static void main(String[] args) {
		System.out.println(toUppercase.apply("chris Imoni"));
		System.out.println(toUppercase2.apply("chris Imoni"));

	}

}
