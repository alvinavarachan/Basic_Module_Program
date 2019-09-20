package Casestudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Booking {
	public static int book[]= new int[25];
	public static int j=1;
public static void main(String[] args) throws NumberFormatException, IOException 

{
String ac ;
String cot ;
String cable;
String wifi ;
String laundry ;

int choice,x,i;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

for ( i=1;i<+25;i++)
{
	book[i]=0;
}
do
{
System.out.println("1. Book");
System.out.println("2. Check Status");
System.out.println("3. Exit");
System.out.println("Enter Your Choice");
choice = Integer.parseInt(br.readLine());
switch (choice)
{
case 1:
	book();
	
	break;
	
case 2:
	status();
	break;
case 3:
	System.exit(0);
	break;
default:
	System.out.println("Choice not available");
	break;
	
}

}while(choice!=3);



}

private static void status() throws NumberFormatException, IOException 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Check Status \n");
	System.out.println("Enter room number");
	int k;
	k = Integer.parseInt(br.readLine());
	if (book[k]==1)
	{
		System.out.println("Room number "+k+ " is booked");
	}
	else
	{
		System.out.println("Room number "+k+ " not is booked");
	}
	
}


public static void book() throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String ac,cot,cable,wifi,laundry,pro;
	int a,co,ca,wi,la,total;
	//int j = 1;
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
	book[j]=1;
	if (pro.contentEquals("yes"))
	{
		System.out.println("Thank you for booking. Your room number is "+j +"\n\n" );
		j++;
	}
	else
	{
		System.out.println("Your booking has been cancelled\n\n");
	}
	
	
	
	
}




}