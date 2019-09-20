package Challenge1;

import java.util.Scanner;
public class Challenge1 
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		int num,d,r,t = 0;
		System.out.println("Enter the number : ");
		num= sc.nextInt();
		d = num/10;
		r=  num%10;
		if (d!=1)
		{
			{
		switch(r)
		{
		case 1:	
		case 2: 
		case 6: t=t+3; break;
		case 4: 
		case 5: 
		case 9: t=t+4; break;
		case 3: 
		case 7: 
		case 8: t=t+5; break;
		
		}
		switch(d)
		{
		case 2: 
		case 3: 
		case 4: 
		case 8: t=t+6; break;
		case 5: 
		case 6: 
		case 9: t=t+5; break;
		case 7: t=t+7; break;
		}
		System.out.println( num+ " = " +t);
		
		}

		}
		
		else
		{
			
		switch (r)
		{
		case 1: 
		case 2: t=t+6; break;
		case 5: 
		case 6: t=t+7; break;
		case 3:
		case 4: 
		case 8: 
		case 9: t=t+8; break;
		case 7: t=t+9; break;
		}
		System.out.println( num+ " = " +t);
		}
	}
		
		
	}
