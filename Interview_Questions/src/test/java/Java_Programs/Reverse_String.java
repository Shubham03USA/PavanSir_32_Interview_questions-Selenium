package Java_Programs;

public class Reverse_String {

	public static void main(String[] args) 
	{
		// Reverse a string
		
		String a = "MohanRaj";
		String b = "";
		//char ch;
		System.out.println("Original string = "+a);
		
		
		for(int i= a.length()-1; i>=0; i--)
		{
			b = b + a.charAt(i);
		}
		
//		for(int i =0; i< a.length(); i++)
//		{
//			ch = a.charAt(i);
//			b = ch + b; 
//		}
		
		System.out.println("Reversed string = "+b);
		
	}


}
