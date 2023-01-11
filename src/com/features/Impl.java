package com.features;

public class Impl implements Functional{

	@Override
	public void m1(String name) {
		
		System.out.println(name);
		
	}
	
	

	@Override
	public void m2(int num) {
		
		
		Functional.super.m2(num);
		
		System.out.println(num);
	}



	public static void main(String[] args) {
		
		Impl i=new Impl();
		
		i.m1("suraj");
		i.m2(30);
		Functional.m3();
	}

}
