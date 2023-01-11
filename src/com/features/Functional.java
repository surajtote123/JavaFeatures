package com.features;

@FunctionalInterface
public interface Functional {
	
	void m1(String name);
	
	default void m2(int num)
	{
		
	}
	
	static void m3()
	{
		System.out.println("This is static method");
	}

}
