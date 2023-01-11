package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String,String> m=new HashMap<>();
		
		m.put("1", "suraj");
		m.put("2", "laksh");
		m.put("3", "pranay");
		
		m.forEach((k,v)->System.out.println(k + " = " + v));
	}

}
