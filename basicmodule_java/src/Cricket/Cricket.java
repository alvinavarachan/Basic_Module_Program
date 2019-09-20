package Cricket;

import java.util.Scanner;

public class Cricket {

	public static void main (String []args)
	{
		Scanner sc= new Scanner (System.in);
		int plr,i,j,k,count=0;
		float res = 0;
		System.out.println("Enter the number of bowlers ");
		plr = sc.nextInt();
		float eco [] = new float[plr];
		int run [] = new int[plr];
		int bow [] = new int[plr];
		System.out.println("Enter the runs conceded by the bowlers ");
		for (i=0; i< plr; i++)
		{
			run[i] = sc.nextInt();  
		}	
		
		System.out.println("Enter the number of balls for each bowlers ");
		
		for (j=0; j< plr; j++)
		{
			
			bow[j] =sc.nextInt();
			
		}
		
		System.out.println("Economy of the bowlers is ");
		
		for (k=0; k< plr; k++)
		{
			eco[k] = (float) (run[k]/(bow[k]/6.0)) ;
			System.out.println( eco[k]);
		}
		for (k=0; k< plr; k++)
		{
		 res= res+ eco[k];
		 
		 if (eco[k]<=6)
		 {
			 count++;
		 }
		}
		float avg= res/plr;
		System.out.println("Economy of the bowlers is "+avg);
		System.out.println("The number of bowlers eligible are "+count);
		
		
		
		
	}
}
