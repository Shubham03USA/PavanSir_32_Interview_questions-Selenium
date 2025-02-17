package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) 
	{
		// 1. Write a program to show how map interface works?
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Ram", 001);
		m.put("Sham", 002);
		m.put("Hari", 003);
		m.put("Pooja", 004);
		m.put("Komal", 005);
		
		System.out.println(" Map example = "+m);
		
		System.out.println("  "+m.keySet());
		System.out.println("  "+m.values());
		System.out.println("  "+m.entrySet());

	}

}
