package com.imonichris.myjavalearning.functional;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args)
    {
		//Takes an input and return true of false	
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i > 18); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(10)); 
    }
}
