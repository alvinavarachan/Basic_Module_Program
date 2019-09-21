package Casestudy5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Roombook {
	public static int id[]= new int[50];
	public static String cname[]= new String[50];
	public static String date[]= new String[50];
	
	public static int i,j=0,d=1,s=0,e=0;
	public static String name ;
public static void main(String[] args) throws NumberFormatException, IOException 


{

String address ;
String contact;
String email ;
String prooftype ;
String proofID ;
String con,bo;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (i=1;i<50;i++)
{
	id[i]=0;
}
do
{
	j++;
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

System.out.println("Thank you for registering. Your id is " +j+ "\n");

System.out.println("Do you want to book a room (y/n)?");
bo=br.readLine();
	if (bo.contentEquals("y"))
	{
	book();
	}

System.out.println("Do you want to continue registration (y/n)?");
con=br.readLine();
}while(con.equalsIgnoreCase("y"));
	
 
 
 if (con.contentEquals("n"))
 {
	
	 ViewCustomer();
 }
		
}
private static void book() throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String ac,cot,cable,wifi,laundry,pro;
	int a,co,ca,wi,la,total;
	
	String wie,cae,lae;
	System.out.println("Booking:");
	System.out.println("Please choose the services required.");
	
	System.out.println("AC/non-AC (AC/nAC)");
	ac=br.readLine();
	System.out.println("Cot (Single/Double)");
	cot=br.readLine();
	System.out.println("With cable connection/without cable connection (C/nC)");
	cable=br.readLine();
	System.out.println("Wi-Fi needed or not (W/nW)");
	wifi=br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=br.readLine();
	System.out.println("Enter the date of booking");
	date[d]=br.readLine();
	
	
	if (ac.contentEquals("AC"))
	{
		a=300;
	}
	else
	{
		a=150;
	}
	if (cot.contentEquals("Double"))
	{
		co=250;
	}
	else
	{
		co=150;
	}
	if (cable.contentEquals("C"))
	{
		ca=200;
		cae="enabled";
	}
	else
	{
		ca=0;
		cae= "disabled";
		
	}
	if (wifi.contentEquals("W"))
	{
		wi=250;
		wie= "enabled";
	}
	else
	{
		wi=0;
		wie= "disabled";
	}
	if (laundry.contentEquals("L"))
	{
		la=100;
		lae= "With";
	}
	else
	{
		la=0;
		lae= "Without";
	}	
	total = a+co+ca+wi+la;
	
	System.out.println("The total charge is Rs " +total);
	System.out.println("\nThe services chosen are\n");
	System.out.println(cot+" cot "+ac+ " room");
	System.out.println("Cable connection "+cae);
	System.out.println("Wi-Fi "+wie);
	System.out.println( lae+" laundry service \n");
	System.out.println("Do you want to proceed? (yes/no)");
	pro=br.readLine();
	if (pro.contentEquals("yes"))
	{
		System.out.println("Thank you for booking. Your room number is "+j +"\n\n" );
		cname[j]= name;
		id[j]=1;
		d++;
	}
	else
	{
		System.out.println("Your booking has been cancelled\n\n");
	}	
}



private static void ViewCustomer() throws IOException 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String start,end;
	System.out.println("\nView all bookings \n");
	System.out.println("Enter the Start date");
	start= br.readLine();
	System.out.println("Enter the End date");
	end= br.readLine();
	for (int k=1; k<50; k++)
	{
		if ((date[k].equals(start)))
		{
			s=k;
			System.out.println(+s);
		}
		if ((date[k].equals(end)))
		{
			e=k;
			System.out.println(+e);
		}
	}
	
	
	
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