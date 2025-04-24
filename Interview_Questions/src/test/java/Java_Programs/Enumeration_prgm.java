package Java_Programs;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_prgm {

	public static void main(String[] args) 
	{
		//Write a program of enumeration?
		
		Vector v = new Vector();
		v.add("ram");
		v.add(20);
		v.add(20.5);
		v.add("mix value can added");
		v.add(55555.2);
		
		System.out.println("Size of vectore = "+v.size());
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(" ==>  " + e.nextElement());

		}
	}

}
