package Java_Programs;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) 
	{
		// copy one array to another array
		
		int test1[] = new int[5];
		test1[0] = 90;
		test1[1] = 80;
		test1[2] = 70;
		test1[3] = 60;
		test1[4] = 50;
		
		System.out.println("This is array one = "+ Arrays.toString(test1));
		
		int test2[]	= new int[5];
		
		for(int i=0; i<5; i++)
		{
		   test2[i] = test1[i];
		   
		}
		
		System.out.println("Copyed one array to another array = "+Arrays.toString(test2));

	}

}
