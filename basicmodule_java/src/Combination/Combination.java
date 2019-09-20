package Combination;
import java.util.Scanner;

public class Combination {
	public static void main (String []args)
	{
		Scanner sc= new Scanner (System.in );
		int num,comb=1;
		System.out.println("Enter the number alphabets in your name");
		num = sc.nextInt();
		for (int i=1; i<=num; i++)
		{
			comb= comb*i;
		}
		
		System.out.println("The number of combination is " +comb);
	}

}
