package Java_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// String is anagram or not
		
		String a = "raciing";
		String b = "careing";
		
		if(a.length()!= b.length())
		{
			System.out.println("not a anagram ...");
		}
		else
		{
			char[] array1 = a.toCharArray();
			char[] array2 = b.toCharArray();
			
			Arrays.sort(array1);
			
			Arrays.sort(array2);
	
		if(Arrays.equals(array1,array2)== true)
		{
			System.out.println("String is anagram ...");
		}
		else
		{
			System.out.println("String is not annagram...");
		}
		
		}
		
	}

}
