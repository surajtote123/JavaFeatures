package com.predicates;

import java.util.function.Function;
import java.util.function.Predicate;

public class A {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20));
		
		System.out.println(p.test(5));
		
		Function<String, Integer> f=s->s.length();
		
		System.out.println(f.apply("suraj"));
	}
	
	

}
