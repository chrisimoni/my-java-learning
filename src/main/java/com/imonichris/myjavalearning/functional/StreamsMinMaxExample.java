package com.imonichris.myjavalearning.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a,b) -> a>b ? a : b);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce((a,b) -> a>b ? a : b);
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		System.out.println("Max value: " + findMaxValue(integerList));
		
		Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
		if(maxValueOptional.isPresent()) {
			System.out.println("Max value using optional: " + maxValueOptional.get());
		} else {
			System.out.println("Input list is empty");
		}
 
	}

}
