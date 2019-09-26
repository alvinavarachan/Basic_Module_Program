package SeparateClass;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Booking {
	String ac,cot,cable,wifi,laundry,pro,bdate;
	public static String cname[]= new String[50];

	public static void book(String sname) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,co,ca,wi,la,total,i=1;
		Booking b[]=new Booking[100];
		String wie,cae,lae;
		System.out.println("Booking:");
		System.out.println("Please choose the services required.");
		b[i]=new Booking();
		System.out.println("AC/non-AC (AC/nAC)");
		b[i].ac=br.readLine();
		System.out.println("Cot (Single/Double)");
		b[i].cot=br.readLine();
		System.out.println("With cable connection/without cable connection (C/nC)");
		b[i].cable=br.readLine();
		System.out.println("Wi-Fi needed or not (W/nW)");
		b[i].wifi=br.readLine();
		System.out.println("Laundry service needed or not(L/nL)");
		b[i].laundry=br.readLine();
		System.out.println("Enter the date of booking");
		b[i].bdate=br.readLine();
		
		
		if (b[i].ac.contentEquals("AC"))
		{
			a=300;
		}
		else
		{
			a=150;
		}
		if (b[i].cot.contentEquals("Double"))
		{
			co=250;
		}
		else
		{
			co=150;
		}
		if (b[i].cable.contentEquals("C"))
		{
			ca=200;
			cae="enabled";
		}
		else
		{
			ca=0;
			cae= "disabled";
			
		}
		if (b[i].wifi.contentEquals("W"))
		{
			wi=250;
			wie= "enabled";
		}
		else
		{
			wi=0;
			wie= "disabled";
		}
		if (b[i].laundry.contentEquals("L"))
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
		System.out.println(b[i].cot+" cot "+b[i].ac+ " room");
		System.out.println("Cable connection "+cae);
		System.out.println("Wi-Fi "+wie);
		System.out.println( lae+" laundry service \n");
		System.out.println("Do you want to proceed? (yes/no)");
		String pro=br.readLine();
		if (pro.contentEquals("yes"))
		{
			System.out.println("Thank you for booking. Your room number is "+i +"\n\n" );
		 cname[i]=sname;
			
			i++;
			
		}
		else
		{
			System.out.println("Your booking has been cancelled\n\n");
		}	

		
	}


}
