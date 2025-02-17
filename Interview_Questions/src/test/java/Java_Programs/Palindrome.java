package Java_Programs;

public class Palindrome {

	public static void main(String[] args) 
	{
		// Write a program for palindrome ?
		
		int r;
		int sum = 0;
		int temp;
		
		int n= 454;
		
		temp = n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;	
		}
		
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not  Palindrome");
		}

	}

}
