package Casestudy4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Updation {
	public static int j=1;
public static void main(String[] args) throws NumberFormatException, IOException 

{
String name ;
String address ;
String contact;
String email ;
String prooftype ;
String proofID ,pro;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
System.out.println("Thank you for registering. Your id is " +j+ "\n");
j++;
System.out.println("Do you want to continue registration (y/n)?");
pro=br.readLine();
}while(pro.equalsIgnoreCase("y"));
		
		System.out.println("Do you want to update the email id?(yes/no)" );
		String check = br.readLine();
		if (check.equalsIgnoreCase("yes"))
		{
		System.out.println("\nUpdate Email:" );
		System.out.println("Enter new Email id" );
		email = br.readLine();
		System.out.println("\nEmail updated" );
		}
	
		System.out.println("\nName : "+name);
		System.out.println("Address : "+address);
		System.out.println("Contact Number : "+contact);
		System.out.println("E-mail Id : "+email);
		System.out.println("Proof Type : "+prooftype);
		System.out.println("Proof ID : "+proofID);		
}
}