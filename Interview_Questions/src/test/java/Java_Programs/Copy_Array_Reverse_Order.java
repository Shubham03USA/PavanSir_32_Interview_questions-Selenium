package Java_Programs;

import java.util.Arrays;

public class Copy_Array_Reverse_Order {

	public static void main(String[] args) 
	{
		//Write a problem for array to store the value and copy in another array with reverse order?

		int[] ar = new int[5];
		ar[0]=2;
		ar[1]=4;
		ar[2]=6;
		ar[3]=8;
		ar[4]=10;
		
		int[] rev = new int[5];
		for(int i=4, j=0; i>=0;i--)
		{
			rev[j] = ar[i];
			j++;
		}
		
		System.out.println("Original array = " + Arrays.toString(ar));
		System.out.println("Copyed and reverse array = " + Arrays.toString(rev));

	}

}
