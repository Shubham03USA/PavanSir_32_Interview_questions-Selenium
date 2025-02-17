package Java_Programs;

public class String_Mutable {

	public static void main(String[] args) 
	{
		// Q7. Write the program to prove string is immutable and StringBuffer is mutable?
		
		String a = "RAMESH";
		a.concat("Sharma");
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer("Harish ");
		sb.append("Pandit");
		System.out.println(sb);


	}

}
