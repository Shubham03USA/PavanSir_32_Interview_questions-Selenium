package Java_Programs;

import java.util.Arrays;

public class Reverce_Array {

	public static void main(String[] args) 
	{
		// Reverse array 
		
	/*
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("Normal array = "+ Arrays.toString(a));
		
		int[] r = new int[a.length];
		
		for(int i=0, j=a.length-1; i< a.length; i++, j-- )
		{
			r [j] = a[i];
		}
		
		System.out.println("After revercing array");
		System.out.println("reverse array = "+ Arrays.toString(r));
 */
		
		int arr[] = new int[]{1,3,5,7,9};
		System.out.println("Original array = ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Reverse array =");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(" "+arr[i]);
		}
		
		
		
		
		
	} 

		

}
