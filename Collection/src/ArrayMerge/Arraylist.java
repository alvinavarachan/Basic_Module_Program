package ArrayMerge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {
	
	public static void main (String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println ("Enter List size");
		int n= sc.nextInt();
		ArrayList<String> list= new ArrayList<String>();
		
		for (int i=0; i<n; i++)
		{
			System.out.println ("Enter List Index["+i+ "]");
			String name= sc.next();
			list.add(name);
			
		}
		
		Iterator<String> itr1=list.iterator();
		while (itr1.hasNext())
		{
			System.out.println (itr1.next());
		}
		
		System.out.println ("Enter List size");
		
		int m= sc.nextInt();
		ArrayList<String> list2= new ArrayList<String>();
		
		for (int i=0; i<m; i++)
		{
			System.out.println ("Enter List Index["+i+ "]");
			String name= sc.next();
			list2.add(name);
			
		}
		list.addAll(list2);
		
		Iterator<String> itr2=list.iterator();
		while (itr2.hasNext())
		{
			System.out.println (itr2.next());
		}
	}
}
