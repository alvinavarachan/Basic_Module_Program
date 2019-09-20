package basicmodule_java;
import java.util.Scanner;

public class Input {
	
		
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.next();
		String degree=sc.nextLine();
		String branch=sc.nextLine();
		String contactNumber=sc.nextLine();
		
		
		
		
		System.out.println("Name : "+name);
		
		System.out.println("Age : "+age);
		
		System.out.println("Degree : "+degree);
		
		System.out.println("Branch : "+branch);
		
		System.out.println("ContactNo : "+contactNumber);
		


		}
		

		
	}

