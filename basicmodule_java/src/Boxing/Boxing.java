package Boxing;

import java.util.Scanner;

public class Boxing 
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		int plr,min=0,pos=1;
		System.out.println("Enter the number of players ");
		plr = sc.nextInt();
		int fouls [] = new int [plr];
		
		System.out.println("The number of fouls made by each player ");
		
		for (int i=0;i<plr;i++)
		{
			fouls[i] = sc.nextInt();
		}
		min=fouls[0];
		for (int i=0;i<plr;i++)
		{
			if (min>fouls[i])
			{
				min=fouls[i];
				
				pos=i+1;
			}
			
		}
		
		
		System.out.println("The eligible player no : " + pos +" ("+min+" fouls)");
}
}
