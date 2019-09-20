package Boxing;

import java.util.Scanner;

public class Boxing 
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		int plr,min=0,temp=0;
		System.out.println("Enter the number of players ");
		plr = sc.nextInt();
		
		int foul [] = new int [plr];
		System.out.println("The number of fouls made by each player ");
		
		for (int i=1;i<=plr;i++)
		{
			foul[i] = sc.nextInt();
		}
		for (int i=1;i<=plr-1;i++)
		{
		
			if (foul[i]<foul[i+1])
			{
				min=foul[i];
				temp=i;
			}
			else
			{
				min=foul[i+1];
				temp=i+1;
			}
		}
		
		
		System.out.println("The eligible player no : " +temp +"(" +min+ "fouls) ");
}
}
