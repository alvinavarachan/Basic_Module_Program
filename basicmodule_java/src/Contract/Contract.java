package Contract;
import java.util.Scanner;
public class Contract {
	public static void main (String[]args)
	{
		Scanner sc= new Scanner (System.in);
		int appl,max=0;
		System.out.println("Enter the number of applications ");
		
		appl = sc.nextInt();
		
		int bid [] = new int[appl];
		System.out.println("Enter the amount in (crores) ");
		for (int i=0; i< appl; i++)
		{
			bid[i] = sc.nextInt();
		}
		for (int i=0; i< appl-1; i++)
		{
			if (bid[i]>bid[i+1])
			{
				max=bid[i];
			}
			else
			{
				max=bid[i+1];
			}
				
		}
		System.out.println("The winning bid is " +max +" crores");
		
	}
}
