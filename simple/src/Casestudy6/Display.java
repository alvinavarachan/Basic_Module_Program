package Casestudy6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Display {
	public static int id[]= new int[50];
	public static String cname[]= new String[50];
	
	public static int i,j=1;
public static void main(String[] args) throws NumberFormatException, IOException 

{
String name ;
String address ;
String contact;
String email ;
String prooftype ;
String proofID ,pro;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (i=1;i<50;i++)
{
	id[i]=0;
}
do
{
System.out.println("Registration \n");
System.out.println("Enter your name");
name=br.readLine();
System.out.println("Enter your address");
address=br.readLine();
System.out.println("Contact Number");
contact=br.readLine();
System.out.println("E-Mail ID");
email=br.readLine();
System.out.println("Enter proof type");
prooftype=br.readLine();
System.out.println("Enter proof id");
proofID=br.readLine();
id[j]=1;
cname[j]=name;
System.out.println("Thank you for registering. Your id is " +j+ "\n");
j++;
System.out.println("Do you want to continue registration (y/n)?");
pro=br.readLine();
}while(pro.equalsIgnoreCase("y"));
	
 ViewCustomer();
	
	
		
}
private static void ViewCustomer() 
{
	System.out.println("\nCustomer ID                   Customer Name");
	for (i=1;i<50;i++)
	{
		if (id[i]==1)
		{
	System.out.println(+i+ "                             "+cname[i]);
		}
	
	}
	
}
}