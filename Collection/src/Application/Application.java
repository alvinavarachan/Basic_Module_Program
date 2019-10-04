package Application;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static ArrayList<String> list= new ArrayList<String>();
	public static Scanner sc= new Scanner (System.in);


public static void main(String []args)
{
	int choice;

	do
	{
		
	System.out.println ("\n\n1.Display installed applications");
		System.out.println ("2.Install an application");
		System.out.println ("3.Uninstall an application");
		System.out.println ("4.Quit");
	    choice= sc.nextInt();
	switch (choice)
	{
	case 1:
		
		display();
		break;
	case 2:
		
		install();
		break;
	case 3:
		
		uninstall();
		break;
	case 4:
		break;
		
	}
	}while(choice!=4);
		
	
	
}

private static void display() {
	
	if (list== null || list.isEmpty() )
	{
		System.out.println ("There is no application installed");
	}
	
	else 
	{
	System.out.println ("The Installed Applications are:");
	int i=1;
	Iterator<String> itr1=list.iterator();
	while (itr1.hasNext())
	{
		System.out.println (i+") "+itr1.next());
		i++;
	}
	}
	
}

private static void install() {
	
	
	System.out.println ("Enter Application Name");
	String name= sc.next();
	list.add(name);
	System.out.println ("Application Installed Successfully");	

}


private static void uninstall() {
	
	System.out.println ("The Installed Applications are:");
	int i=1;
	Iterator<String> itr1=list.iterator();
	while (itr1.hasNext())
	{
		System.out.println (i+") "+itr1.next());
		i++;
	}
	
	System.out.println ("Enter Application Number");
	int un= sc.nextInt();
	list.remove(un-1);
	System.out.println ("Application Uninstalled Successfully");
	
	
}



}