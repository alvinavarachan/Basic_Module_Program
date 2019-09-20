package Fibonacci;
import java.util.Scanner;

public class Fibonacci 
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		int num,f=0,s=1,res;
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.print("The fibonacci series is " +f+" "+s);
		for (int i=0; i< num+1; i++)
		{
			res= f+s;
			f=s;
			s=res;
			System.out.print(" "+res);
		}
		
	}

}
