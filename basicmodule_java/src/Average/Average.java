package Average;
import java.util.Scanner;

public class Average {

public static void main(String [] args) 
{
	Scanner s = new Scanner(System.in);
	int total,i,sum=0;
	System.out.println("Enter number of students : ");
	total = s.nextInt();
	System.out.println("Enter the marks of students : ");
	int arr [] = new int[total];
	
	for(i=0;i<total;i++)
	{
		arr[i] = s.nextInt(); 
		sum= sum+ arr[i];
	}
	
	System.out.println("The Average is : "+(sum)/total );
}
}
