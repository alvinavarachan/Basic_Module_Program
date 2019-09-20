package Retest;
import java.util. Scanner;
public class Retest 
{

	public static void main(String [] args) 
	{
		Scanner s = new Scanner(System.in);
		int total,i,count=0;
		float temp;
		System.out.println("Enter number of students : ");
		total = s.nextInt();
		System.out.println("Enter the marks of students : ");
		int arr [] = new int[total];
		
		for(i=0;i<total;i++)
		{
			arr[i] = s.nextInt(); 
			if(arr[i]<50)
			{
				count++;
			}
		}
		System.out.println ("Number of students appearing for retest is " +count);
	}
		
}
