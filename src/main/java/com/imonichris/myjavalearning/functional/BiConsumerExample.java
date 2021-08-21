package com.imonichris.myjavalearning.functional;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		// BiConsumer is a functional interface; it takes two arguments and returns
		// nothing.
		BiConsumer<String, String> bc = (a, b) -> System.out.println("a: " + a + " b:" + b);
		bc.accept("Hello", "World");

	}
}
