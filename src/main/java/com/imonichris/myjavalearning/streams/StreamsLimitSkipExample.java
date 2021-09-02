package com.imonichris.myjavalearning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
	
	public static Optional<Integer> limit(List<Integer> numbers) {
		return numbers.stream().limit(2).reduce((a,b) -> a+b);
	}
	
	public static Optional<Integer> skip(List<Integer> numbers) {
		return numbers.stream().skip(3).reduce((a,b) -> a+b);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6,7,8,9,10);
		Optional<Integer> result = limit(numbers);
		if(result.isPresent()) {
			System.out.println("The limit result is: "+ result.get());
		}else {
			System.out.println("No input is passed");
		}
		
		Optional<Integer> resultResult = skip(numbers);
		if(resultResult.isPresent()) {
			System.out.println("The limit result is: "+ resultResult.get());
		}else {
			System.out.println("No input is passed");
		}

	}

}
