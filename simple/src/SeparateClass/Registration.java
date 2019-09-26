package SeparateClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Registration {
	String name;
	String address ;
	String contact;
	String email ;
	String prooftype ;
	String proofID ;
	String con,bo;
	public static int id[]= new int[50];
	Registration reg[]=new Registration[100];
	
	void register() throws IOException
	{
		int j=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=1;i<50;i++)
		{
			id[i]=0;
		}
		do
		{
			j++;
			reg[j]=new Registration();
		System.out.println("Registration \n");
		System.out.println("Enter your name");
		reg[j].name=br.readLine();
		System.out.println("Enter your address");
		reg[j].address=br.readLine();
		System.out.println("Contact Number");
		reg[j].contact=br.readLine();
		System.out.println("E-Mail ID");
		reg[j].email=br.readLine();
		System.out.println("Enter proof type");
		reg[j].prooftype=br.readLine();
		System.out.println("Enter proof id");
		reg[j].proofID=br.readLine();


		System.out.println("Thank you for registering. Your id is " +j+ "\n");

		System.out.println("Do you want to book a room (y/n)?");
		bo=br.readLine();
			if (bo.contentEquals("y"))
			{
			Booking.book(reg[j].name);
			}

		System.out.println("Do you want to continue registration (y/n)?");
		con=br.readLine();
		}while(con.equalsIgnoreCase("y"));
			
		 
		 
		 if (con.contentEquals("n"))
		 {
			
			 viewCustomer(j);
		 }
	}
	public void viewCustomer(int j)throws IOException {
		
			
			
			
			
			System.out.println("\nCustomer ID                   Customer Name");
			for (int i=1;i<=j;i++)
			{
				
			System.out.println(+i+ "                             "+reg[i].name);
				}
			
			}
		
		
		
	

}
