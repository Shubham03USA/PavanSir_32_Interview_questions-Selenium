package Java_Programs;

import java.util.Arrays;

public class ToCharArray_use {

	public static void main(String[] args) 
	{
		//  How to use tocharArray ()?
		
		String s = "SHUBHAM";
		char[] c = s.toCharArray();
		
		Arrays.sort(c);
		
		System.out.println( Arrays.toString(c));
		

	}

}
